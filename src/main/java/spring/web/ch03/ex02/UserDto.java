package spring.web.ch03.ex02;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserDto {
	private String name;
	private int age;
	private MultipartFile face;
}
