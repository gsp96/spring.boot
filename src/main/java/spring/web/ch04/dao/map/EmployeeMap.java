package spring.web.ch04.dao.map;

import spring.web.ch04.domain.Employee;

public interface EmployeeMap {
	Employee selectEmployee(int employeeId);
}
