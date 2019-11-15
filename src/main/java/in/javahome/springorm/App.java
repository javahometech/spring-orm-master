package in.javahome.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springorm.dao.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-orm.xml");
		EmployeeDAO employeeDAO = cxt.getBean(EmployeeDAO.class);
//		Employee emp = new Employee();
//		emp.setEmpName("Hari");
//		emp.setPhone("999999999");
		employeeDAO.deleteEmployee(5);
		System.out.println("This is to test maven snapshot");
		System.out.println("This is to test maven snapshot");
	}
}
