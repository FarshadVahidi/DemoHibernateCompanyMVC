package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
		Session currentSession = MySession();
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	private Session MySession() {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = MySession();
		Employee employee = currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession = MySession();
		currentSession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession = MySession();
		Employee employee = currentSession.get(Employee.class, id);
		currentSession.delete(employee);
	}

	
	
}
