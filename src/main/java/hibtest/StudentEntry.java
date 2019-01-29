package hibtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentEntry {

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setRno(111); s1.setName("AAA"); s1.setBranch("CS"); s1.setSem(3);
		s2.setRno(112); s2.setName("BBB"); s2.setBranch("IT"); s2.setSem(5);
		s3.setRno(113); s3.setName("CCC"); s3.setBranch("Civil"); s3.setSem(4);
		//configure method will read the contents of hibernate.cfg.xml 
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s1); session.save(s2); session.save(s3);
		tr.commit();
		session.close();
		System.out.println("DATA STORED");
		
		

	}

}
