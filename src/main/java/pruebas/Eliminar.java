package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Eliminar {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();  
		
		Subject deleteSubject = dao.find(1);        
        dao.delete(deleteSubject.getIdsubject()); 
         
		List<Subject> subjectList = dao.findAll();
		System.out.println("Registro Eliminado");
		for(Subject s: subjectList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}

