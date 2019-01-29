package hibtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDeletion {

	public static void main(String[] args) {

		Student s=new Student(); s.setRno(113);
		SessionFactory sf=Data.getSF();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(s);
		tr.commit();
		System.out.println("RECORD REMOVED");

	}

}
