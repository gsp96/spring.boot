package spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
	private String name;
	private int age;
	private LocalDate regDate;
}
