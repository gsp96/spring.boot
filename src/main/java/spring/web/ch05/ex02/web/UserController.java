package spring.web.ch05.ex02.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.web.ch05.domain.User;
import spring.web.ch05.ex02.service.HrService;

@RestController("ch05.ex02")
@RequestMapping("ch05/ex02/user")
public class UserController {
	@Autowired private HrService hrService;
	
	@GetMapping
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex02/main");
		return mv;
	}
	
	@GetMapping("list")
	public List<User> getUsers() {
		return hrService.getUsers();
	}
	
	@PostMapping("add")
	public void addUser(@RequestBody User user) {
		hrService.addUser(user);
	}
	
	@PutMapping("fix")
	public void fixUser(@RequestBody User user) {
		hrService.fixUser(user);
	}
	
	@DeleteMapping("del/{userId}")
	public void delUser(@PathVariable int userId) {
		hrService.delUser(userId);
	}
	
}
