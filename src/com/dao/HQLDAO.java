package com.dao;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HQLDAO extends HibernateDaoSupport {

	public List jdbc(String sql, Class c, Object... p) {
		List list = new ArrayList();
		Session session = getHibernateSession();
		Connection con = session.connection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (p != null) {
				for (int i = 0; i < p.length; i++) {
					ps.setObject(i + 1, p[i]);
				}
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				Object obj = c.newInstance();

				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String columnName = rsmd.getColumnName(i + 1);
					Field field = c.getDeclaredField(columnName);
					if (field == null)
						continue;
					field.setAccessible(true);
					Object value = rs.getObject(columnName);
					field.set(obj, value);
				}
				list.add(obj);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return list;

	}

	public Session getHibernateSession() {
		return (Session) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						return session;
					}

				});

	}

	public Object queryFunction(final String fn, final Object... p) {
		return super.getHibernateTemplate().execute(new HibernateCallback() {
			// {?=call getchild(?)}
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Connection connection = session.connection();
				String sql = fn;
				CallableStatement cs = connection.prepareCall(sql);
				cs.registerOutParameter(1, Types.VARCHAR);
				if (p != null)
					for (int i = 0; i < p.length; i++) {
						cs.setObject(i + 2, p[i]);
					}
				cs.execute();
				String msg = cs.getString(1);
				return msg;
			}
		});
	}

	public float unique(final String hql, final Object... p) {

		List list = findByHQL(hql, p);

		if (list.size() > 0) {
			Object obj = list.get(0);
			if (obj != null) {
				return Float.parseFloat(obj.toString());
			}
		}
		return 0;
	}

	public List findByHQL(final String hql, final Object... p) {
		List list = getHibernateTemplate().find(hql, p);
		return list;
	}
	// page:页 ，size:数据多少
		public List pageQuery2(final StringBuffer hql, final Integer page,
				final Integer size,final Object... p) {
			return getHibernateTemplate().executeFind(new HibernateCallback() {

				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					String shql=hql.toString();
					Query query = session.createQuery(shql);
					if (p != null)
						for (int i = 0; i < p.length; i++) {
							query.setParameter(i, p[i]);
						}
					if (page != null && size != null)
						query.setFirstResult((page - 1) * size).setMaxResults(size);
					return query.list();
				}
			});
		}

	// page:页 ，size:数据多少
	public List pageQuery(final String hql, final Integer page,
			final Integer size, final Object... p) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				if (p != null)
					for (int i = 0; i < p.length; i++) {
						query.setParameter(i, p[i]);
					}
				if (page != null && size != null)
					query.setFirstResult((page - 1) * size).setMaxResults(size);
				return query.list();
			}
		});
	}

	// 
	public void bulkUpdate(String hql, Object... p) {
		getHibernateTemplate().bulkUpdate(hql, p);
	}

}
