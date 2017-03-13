package com.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pojo.Link;

/**
 * A data access object (DAO) providing persistence and search support for Link
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.pojo.Link
 * @author MyEclipse Persistence Tools
 */
public class LinkDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(LinkDAO.class);
	// property constants
	public static final String LINK_HREF = "linkHref";
	public static final String LINK_NAME = "linkName";

	protected void initDao() {
		// do nothing
	}

	public void save(Link transientInstance) {
		log.debug("saving Link instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Link persistentInstance) {
		log.debug("deleting Link instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Link findById(java.lang.Integer id) {
		log.debug("getting Link instance with id: " + id);
		try {
			Link instance = (Link) getHibernateTemplate().get("com.pojo.Link",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Link instance) {
		log.debug("finding Link instance by example");
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
		log.debug("finding Link instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Link as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLinkHref(Object linkHref) {
		return findByProperty(LINK_HREF, linkHref);
	}

	public List findByLinkName(Object linkName) {
		return findByProperty(LINK_NAME, linkName);
	}

	public List findAll() {
		log.debug("finding all Link instances");
		try {
			String queryString = "from Link";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Link merge(Link detachedInstance) {
		log.debug("merging Link instance");
		try {
			Link result = (Link) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Link instance) {
		log.debug("attaching dirty Link instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Link instance) {
		log.debug("attaching clean Link instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LinkDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LinkDAO) ctx.getBean("LinkDAO");
	}
}