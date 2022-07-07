package spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ch02/ex01")
public class UserController {
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	
	@GetMapping("31")
	public void handler31(User user) {
		user.setName("양승일");
		user.setAge(11);
	}
	
	@GetMapping("32")
	public void handler32(@ModelAttribute("man")User user) {
		user.setName("서준현");
		user.setAge(32);
	}
	
	@GetMapping("41")
	public User handler41(User user) {
		user.setName("김가람");
		user.setAge(41);
		
		return user;
	}
	
	@GetMapping("42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setAge(42);
		user.setName("백건우");
		
		return user;
	}
}
