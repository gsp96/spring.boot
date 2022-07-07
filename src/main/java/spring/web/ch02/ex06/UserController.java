package spring.web.ch02.ex06;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")
	public String loginIn(@CookieValue(required=false) String userId,User user) {
		if(userId != null) user.setId(userId);
		return "ch02/ex06/login";
	}
	
//	@PostMapping("login")
//	public String login(User user) {
//		return "ch02/ex06/logout";
//	}
	
	@PostMapping("login")
	public String login(User user, String rememberMe, HttpSession session, HttpServletResponse response) {
		if(session.getAttribute("userId") == null) session.setAttribute("userId", user.getId());
		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("userId", user.getId());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		
		return "ch02/ex06/logout";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
}
