package com.common.dao;



import java.util.List;

import com.common.model.Mail;

/**

 * @author Gaspar Rajoy

 **/
public interface MailDAO {

		public Mail save(Mail mail);
		public int delete(Mail mail);
		public int delete(Long id);
		public Mail update(Mail mail);
		public Mail selectById(Long id);
		public List<Mail> getAll();
		public List<Mail> getUnsent();
		
		
}
