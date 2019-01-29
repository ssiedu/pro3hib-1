package hibtest;

import org.hibernate.Session;

public class ShowSingleRecord {

	public static void main(String[] args) {

		Session ses=Data.getSF().openSession();
		
		Student stud=ses.get(Student.class, 112);

		System.out.println(stud);
		//System.out.println(stud.getName());
		//System.out.println(stud.getBranch());
		
		ses.close();
	}

}
