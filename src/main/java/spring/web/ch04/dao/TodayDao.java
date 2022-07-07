package spring.web.ch04.dao;

import java.time.LocalDate;

public interface TodayDao {
	LocalDate selectToday();
}
