package Rest.com.WebService.DAL;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AndroidDataHandler {
		static public void AddAndroidData(String My_title, String My_user ,String My_image , String My_video, float My_longitude,float My_latitude ,String My_commentaire) {
		Session session = HibernateSession.getSessionFactory().openSession();
		Transaction transaction = null;
		try {

			System.out.println("android data handler");
			transaction = session.beginTransaction();
			String sql = "INSERT INTO ANDROID_DATA(TITLE, USER_ID,IMAGE, VIDEO, LONGITUDE, LATITUDE, COMMENTAIRE) VALUES(?,?,?,?,?,?,?)";
			Query query = session.createSQLQuery(sql);
			query.setParameter(0, My_title);
			query.setParameter(1, My_user);
			query.setParameter(2, My_image);
			query.setParameter(3, My_video);
			query.setParameter(4, My_longitude);
			query.setParameter(5, My_latitude);
			query.setParameter(6, My_commentaire);
			
			
			System.out.println("------------------------------------------------");
			System.out.println("------------adding these information------------");
			System.out.println(My_title);
			System.out.println(My_user);
			System.out.println(My_image);
			System.out.println(My_video);
			System.out.println(My_longitude);
			System.out.println(My_latitude);
			System.out.println(My_commentaire);
			System.out.println("------------------------------------------------");
						
			query.executeUpdate();
			session.getTransaction().commit();

			session.flush();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
