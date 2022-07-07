package spring.web.ch05.ex02.service;

import java.util.List;

import spring.web.ch05.domain.User;

public interface HrService {
	List<User> getUsers();
	void addUser(User user);
	void fixUser(User user);
	void delUser(int userId);
}
