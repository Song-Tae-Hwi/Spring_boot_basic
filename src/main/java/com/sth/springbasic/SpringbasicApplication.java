package com.sth.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sth.springbasic.dto.Lombok;

@SpringBootApplication
public class SpringbasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbasicApplication.class, args);
	}

	void lombokExample() {
		Lombok lombok = new Lombok("a", "b", "c", false, false);
		lombok.getField1();
		lombok.setField3(null);

		// lombok = new Lombok();
		lombok = new Lombok("d", "e");

		// lombok.getField4();
	}
}
