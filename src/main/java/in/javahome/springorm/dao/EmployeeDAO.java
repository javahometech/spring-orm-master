package in.javahome.springorm.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springorm.entity.Employee;
@Component
public class EmployeeDAO {
	@Autowired
	private HibernateTemplate template;
	@Transactional
	public void addEmployee(Employee emp){
		
		template.save(emp);
	}
	@Transactional()
	public void deleteEmployee(Integer empId) throws Exception{
		Employee emp = template.get(Employee.class, empId);
		template.delete(emp);
		Thread.sleep(1050*60);
		if(10 == 10){
			throw new RuntimeException();
		}
	}
	
	public List<Employee> findAll(){
		DetachedCriteria crit = DetachedCriteria.forClass(Employee.class);
		crit.add(Restrictions.isNotEmpty("empName"));
		return (List<Employee>) template.findByCriteria(crit);
	}
	
	public void executeDemo(){
		template.execute(new HibernateCallback<List<Employee>>() {
			public List<Employee> doInHibernate(Session session) throws HibernateException {
				return session.createCriteria(Employee.class).list();
			}
		});
	}
}
