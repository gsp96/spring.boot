package spring.web.ch04.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web.ch04.dao.TodayDao;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired private TodayDao todayDao;
	
	@Override
	public LocalDate getToday() {
		return todayDao.selectToday();
	}
}
