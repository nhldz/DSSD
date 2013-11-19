package com.common.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.common.model.Empleado;

@Transactional
public class EmpleadoDAOImpl implements EmpleadoDAO{
	
    private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = false)
	public void saveEmpleado(Empleado person) {
		this.sessionFactory.getCurrentSession().save(person);
	}

	@Transactional(readOnly = false)
	public void deleteEmpleado(Empleado person) {
		this.sessionFactory.getCurrentSession().delete(person);
	}
	
	public List<Empleado> getAllEmpleado() {
		@SuppressWarnings("unchecked")
		List<Empleado> persons =  this.sessionFactory.getCurrentSession().createCriteria(Empleado.class).list();
		
		return persons;
	}

	public Empleado selectEmpleadoByCuit(String cuit) {
		return (Empleado) this.sessionFactory.getCurrentSession()
								.createCriteria(Empleado.class)
								.add(Restrictions.eq("cuit", cuit))
								.uniqueResult();
	}


	@Override
	public void updateEmpleado(Empleado person) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(person);
	
	}


	
}
