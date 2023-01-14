package com.furkan.agile.board.restApi;


import com.furkan.agile.board.business.IIssueService;
import com.furkan.agile.board.entity.Issue;
import com.furkan.agile.board.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {
    @Autowired
    IIssueService iIssueManger;

    public IssueController(IIssueService iIssueManger) {
        this.iIssueManger = iIssueManger;
    }


    @GetMapping("/test")
    public String workingTest(Model model){

        model.addAttribute("message","It works..");
        model.addAttribute("listOfIssue",iIssueManger.findAll());

        return "workingtest";
    }
    @GetMapping("/findAll")
    public String getAll(Model model){
        model.addAttribute("listOfIssue",iIssueManger.findAll());
        model.addAttribute("listOfBacklogIssue",iIssueManger.findAllBacklog());
        model.addAttribute("listOfTodoIssue",iIssueManger.findAllTodo());
        model.addAttribute("listOfInProgressIssue",iIssueManger.findAllInProgress());
        model.addAttribute("listOfDoneIssue",iIssueManger.findAllDone());

        return "findall";
    }


}
