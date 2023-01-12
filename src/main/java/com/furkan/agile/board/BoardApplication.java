package com.furkan.agile.board;

import com.furkan.agile.board.repository.IssueRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BoardApplication {

	@Autowired
	private IssueRepository issueRepository;


	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
//		System.out.println("All available issues are: " + issueRepository.findAll());
		System.out.println("Everything initialized..");
	}
}
