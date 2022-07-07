package spring.web.ch04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web.ch04.dao.EmployeeDao;
import spring.web.ch04.domain.Employee;

@Service("ch04.HrService")
public class HrServiceImpl implements HrService{
	@Autowired private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.selectEmployee(employeeId);
	}
}
