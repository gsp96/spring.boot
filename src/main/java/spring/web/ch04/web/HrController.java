package spring.web.ch04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import spring.web.ch04.domain.Employee;
import spring.web.ch04.service.HrService;

@Controller("ch04.employee")
public class HrController {
	@Autowired private HrService hrService;
	
	@GetMapping("ch04/employee/{employeeId}")
	public String getEmployee(@PathVariable int employeeId, Model model) {
		Employee employee = hrService.getEmployee(employeeId);
		model.addAttribute("employee", employee);
		
		return "ch04/employee";
	}
}
