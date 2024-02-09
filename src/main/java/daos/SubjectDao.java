package daos;

import java.util.List;

import model.Subject;

public interface SubjectDao {

	public void create(Subject rol);
	
	public void update(Subject rol);
	
	public void delete(Integer id);
	
	public Subject find(Integer id);
	
	public List<Subject> findAll();
}
