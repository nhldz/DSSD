package com.common.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.common.model.Mail;

/**

 * @author Gaspar Rajoy

 **/
@Transactional
public class MailDAOImpl implements MailDAO {


    private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public Mail save(Mail mail) {
		this.sessionFactory.getCurrentSession().save(mail);
		return mail;
	}

	@Override
	public int delete(Mail mail) {
		this.sessionFactory.getCurrentSession().delete(mail);
		return 0;
	}

	@Override
	public Mail update(Mail mail) {
		this.sessionFactory.getCurrentSession().update(mail);
		return mail;
	}

	@Override
	public Mail selectById(Long id) {
		Mail mail = (Mail) this.sessionFactory.getCurrentSession()
				.createCriteria(Mail.class)
				.add(Restrictions.eq("id",id))
				.uniqueResult();
		
		return mail;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mail> getAll() {
		return (List<Mail>) this.sessionFactory.getCurrentSession().createCriteria(Mail.class).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Mail> getUnsent(){
		List<Mail> mails = this.sessionFactory.getCurrentSession()
				.createCriteria(Mail.class)
				.add(Restrictions.ne("status",Mail.SENT)).list();
		
		return mails;
		
	}


	@Override
	public int delete(Long id) {
		
		this.delete(this.selectById(id));
		
		return 0;
	}

}
