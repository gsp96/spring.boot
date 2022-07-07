package spring.web.ch04.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch04.dao.map.EmployeeMap;
import spring.web.ch04.domain.Employee;

@Repository("ch04.EmployeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired private EmployeeMap employeeMap;
	
	@Override
	public Employee selectEmployee(int employeeId) {
		return employeeMap.selectEmployee(employeeId);
	}	
}