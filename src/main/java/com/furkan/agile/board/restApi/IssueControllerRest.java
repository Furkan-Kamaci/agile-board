package com.furkan.agile.board.restApi;

import com.furkan.agile.board.entity.Issue;
import com.furkan.agile.board.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
//@RestController
//@RequestMapping("/api/issue")
public class IssueControllerRest {

    @Autowired
    private IssueRepository issueRepository;

    @GetMapping("/test")
    public String workCheck(){
        return "it works...";
    }

    @GetMapping("/findAll")
    public List<Issue> getAll(){
       return issueRepository.findAll();
    }

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Issue issue) {
        issueRepository.save(issue);
        return "Employee saved..";
    }



}
