package Rest.com.WebService.DAL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Rest.com.WebService.model.Utilisateur;

public class UtilisateurHandler {
	
	static int authentic = 000;

	static public int SearchForUser(String Mylogin, String Mypassword) {
		authentic = 000;
		Session session = HibernateSession.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			String hql = "FROM Utilisateur u WHERE u.LOGIN= :login and u.PASSWORD=:password";
			System.out.println(hql);
			Query query = session.createQuery(hql);
			query.setParameter("login", Mylogin);
			System.out.println(Mylogin);
			query.setParameter("password", Mypassword);
			System.out.println(Mypassword);
			List users = query.list();

			for (Iterator iterator2 = users.iterator(); iterator2.hasNext();) {
				Utilisateur user = (Utilisateur) iterator2.next();
				System.out.println("----------------------------------------");
				System.out.println("-----------------SEARCH-----------------");
				System.out.println("ID : " + user.getUSER_ID());						
				System.out.println("Login: " + user.getLOGIN());
				System.out.println("Password: " + user.getPASSWORD());
				System.out.println("----------La liste n'est pas viiiiiiiide----------");
				 
				authentic = Integer.parseInt(user.getUSER_ID());
				
			}

			if (authentic == 0) {
				System.out.println("La liste est vide");
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			HibernateSession.shutdown();
		}
		return authentic;
	}
	
	
}
