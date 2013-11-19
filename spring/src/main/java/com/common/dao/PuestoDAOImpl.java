package com.common.dao;


import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.common.model.Puesto;

@Transactional
public class PuestoDAOImpl implements PuestoDAO{
	
    private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Puesto getPuestoById(Long id) {
		return (Puesto) this.sessionFactory.getCurrentSession()
								.createCriteria(Puesto.class)
								.add(Restrictions.eq("id", id))
								.uniqueResult();
		
		
	}


	
}
