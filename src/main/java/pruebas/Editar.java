package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Editar {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();  
		
		Subject updatedSub = dao.find(1);
		updatedSub.setSubject("Lenguaje Programación II");
		updatedSub.setCredits("5");
        dao.update(updatedSub);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}

