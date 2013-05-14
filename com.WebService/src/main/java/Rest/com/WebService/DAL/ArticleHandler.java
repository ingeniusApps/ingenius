package Rest.com.WebService.DAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Rest.com.WebService.model.*;

public class ArticleHandler {
	
	
	static String id;
	static String title;
	static String content;
	static Map<String, String> map = new HashMap<String, String>();
	static List<Article> My_articles = new ArrayList<Article>();
	static Article article;

	static public List<Article> GetArticles() {
		System.out.println("**Example : Hibernate 4 SessionFactory**");
		System.out.println("----------------------------------------");

		Session session = HibernateSession.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List articles = session.createQuery("FROM Article").list();
			
			for (Iterator iterator = articles.iterator(); iterator.hasNext();) {
				article = (Article) iterator.next();

				System.out.println("----------------------------------------");

				System.out.println("First Name: " + article.getARTICLE_ID());
				id = article.getARTICLE_ID();
				//map.put("id", article.getARTICLE_ID());

				System.out.println("Last Name: " + article.getARTICLE_TITLE());
				title = article.getARTICLE_TITLE();
				//map.put("Titre", article.getARTICLE_TITLE());

				System.out.println("Salary: " + article.getCONTENT());
				content = article.getCONTENT();
				//map.put("Content", article.getCONTENT());

				My_articles.add(article);

			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			HibernateSession.shutdown();
		}
		
		return My_articles;
	}


}
