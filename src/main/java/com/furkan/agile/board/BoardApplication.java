package com.furkan.agile.board;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {




	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
//		System.out.println("All available issues are: " + issueRepository.findAll());
		System.out.println("Everything initialized..");
	}
}
