package spring.web.ch04.dao;

import spring.web.ch04.domain.Employee;

public interface EmployeeDao {
	Employee selectEmployee(int employeeId);
}
