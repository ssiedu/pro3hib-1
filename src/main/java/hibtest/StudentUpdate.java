package hibtest;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentUpdate {

	public static void main(String[] args) {
		Session session=Data.getSF().openSession();
		
		//Student s=new Student();
		//s.setRno(113); s.setSem(5);
		
		Student s=session.get(Student.class, 113);
		s.setSem(5);
		
		Transaction tr=session.beginTransaction();
		session.update(s);
		tr.commit();
		session.close();
		
		System.out.println("DATA CHANGED");
	}

}
