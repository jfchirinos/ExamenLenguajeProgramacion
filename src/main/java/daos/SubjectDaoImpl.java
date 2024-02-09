package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class SubjectDaoImpl implements SubjectDao {

	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("CL1_Chirinos_Cuba_Jean_Frank");
		em = factory.createEntityManager();
	}
	@Override
	public void create(Subject subject) {
	
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(Subject subject) {
		try {
			em.getTransaction().begin();
		    em.merge(subject);
		    em.getTransaction().commit();
		}
		catch (Exception e){
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		Subject subject = em.find(Subject.class, id);
	    if (subject != null) {
	        em.remove(subject);
	    }
	    em.getTransaction().commit();
		
	}

	@Override
	public Subject find(Integer id) {
		return em.find(Subject.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> findAll() {
		
		Query query = em.createQuery("SELECT s FROM Subject s");
		List<Subject> list = query.getResultList();
		return list;
	}
}
