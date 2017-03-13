package com.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pojo.Lunbotu;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lunbotu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pojo.Lunbotu
 * @author MyEclipse Persistence Tools
 */

public class LunbotuDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(LunbotuDAO.class);
	// property constants
	public static final String _LNAME = "LName";
	public static final String _LTITLE = "LTitle";
	public static final String _LSTATU = "LStatu";
	public static final String _LLIANJIE = "LLianjie";
	public static final String _LCONTENT = "LContent";

	protected void initDao() {
		// do nothing
	}

	public void save(Lunbotu transientInstance) {
		log.debug("saving Lunbotu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Lunbotu persistentInstance) {
		log.debug("deleting Lunbotu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Lunbotu findById(java.lang.Integer id) {
		log.debug("getting Lunbotu instance with id: " + id);
		try {
			Lunbotu instance = (Lunbotu) getHibernateTemplate().get(
					"com.pojo.Lunbotu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Lunbotu instance) {
		log.debug("finding Lunbotu instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Lunbotu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Lunbotu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLName(Object LName) {
		return findByProperty(_LNAME, LName);
	}

	public List findByLTitle(Object LTitle) {
		return findByProperty(_LTITLE, LTitle);
	}

	public List findByLStatu(Object LStatu) {
		return findByProperty(_LSTATU, LStatu);
	}

	public List findByLLianjie(Object LLianjie) {
		return findByProperty(_LLIANJIE, LLianjie);
	}

	public List findByLContent(Object LContent) {
		return findByProperty(_LCONTENT, LContent);
	}

	public List findAll() {
		log.debug("finding all Lunbotu instances");
		try {
			String queryString = "from Lunbotu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Lunbotu merge(Lunbotu detachedInstance) {
		log.debug("merging Lunbotu instance");
		try {
			Lunbotu result = (Lunbotu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Lunbotu instance) {
		log.debug("attaching dirty Lunbotu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Lunbotu instance) {
		log.debug("attaching clean Lunbotu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LunbotuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LunbotuDAO) ctx.getBean("LunbotuDAO");
	}
}