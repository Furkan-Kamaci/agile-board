package com.furkan.agile.board.restApi;

import com.furkan.agile.board.entity.Issue;
import com.furkan.agile.board.repository.IssueRepository;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {

    @Autowired
    private IssueRepository issueRepository;

    @GetMapping("/a")
    public String workCheck(){
        return "it works...";
    }

    @GetMapping("/all")
    public List<Issue> getAll(){
       return issueRepository.findAll();
    }

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Issue issue) {
        issueRepository.save(issue);
        return "Employee saved..";
    }



}
