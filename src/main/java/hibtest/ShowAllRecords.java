package hibtest;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ShowAllRecords {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		//QBC (Query By Criteria)
		Criteria cr=session.createCriteria(Student.class);
		List<Student> list=cr.list();
		
		for(Student s:list){
			System.out.println(s);
			//System.out.println(s.getName()+","+s.getBranch());
		}
		
		
		session.close();
	}

}
