package spring.web.ch05.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String userName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")//command로 만들때 사용
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")//Json으로 만들때 사용
	private LocalDate birthday;
}
