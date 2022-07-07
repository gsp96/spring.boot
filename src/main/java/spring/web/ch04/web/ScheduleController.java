package spring.web.ch04.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import spring.web.ch04.service.ScheduleService;

@Controller
public class ScheduleController {
	@Autowired private ScheduleService scheduleService;
	
	@GetMapping("ch04/today")
	@ModelAttribute("today")
	public LocalDate today() {
		return scheduleService.getToday();
	}
}
