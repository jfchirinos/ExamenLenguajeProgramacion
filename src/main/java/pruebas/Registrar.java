package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Registrar {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();  
		
		Subject sub = new Subject();
		sub.setSubject("L. Programación II");
		sub.setCredits("3");
		
		dao.create(sub);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}

