package com.furkan.agile.board.restApi;


import com.furkan.agile.board.business.IIssueService;
import com.furkan.agile.board.entity.Issue;
import com.furkan.agile.board.entity.Status;
import com.furkan.agile.board.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
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
    @GetMapping("/board")
    public String board(Model model){
        model.addAttribute("listOfIssue",iIssueManger.findAll());
        model.addAttribute("listOfBacklogIssue",iIssueManger.findAllBacklog());
        model.addAttribute("listOfTodoIssue",iIssueManger.findAllTodo());
        model.addAttribute("listOfInProgressIssue",iIssueManger.findAllInProgress());
        model.addAttribute("listOfDoneIssue",iIssueManger.findAllDone());

        return "board";
    }




    @GetMapping("/saveIssueForm")
    public String goToSaveIssueForm(){

        return "saveissueform";
    }

    @RequestMapping(value = "/saveIssue", method = RequestMethod.POST)
//    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
//    public ModelAndView saveIssue(@ModelAttribute Issue issue)
    public RedirectView saveIssue(@ModelAttribute Issue issue)
    {
        System.out.println("Issue from UI = " + issue);
        /*
         * Here you can write the code to save the user information in database
         */
        iIssueManger.save(issue);


//        ModelAndView modelAndView = new ModelAndView();
////        modelAndView.setViewName("issue_information");
//        modelAndView.setViewName("findAll");
//        modelAndView.addObject("listOfBacklogIssue",iIssueManger.findAllBacklog());
//        modelAndView.addObject("listOfTodoIssue",iIssueManger.findAllTodo());
//        modelAndView.addObject("listOfInProgressIssue",iIssueManger.findAllInProgress());
//        modelAndView.addObject("listOfDoneIssue",iIssueManger.findAllDone());
//        modelAndView.addObject("issue", issue);
//       return modelAndView;

        return new RedirectView("board");
    }


//    @GetMapping("/editIssueForm")
//    public String editIssueForm(Model model){
//
//        return "editissueform";
//    }


    @GetMapping("/editIssueForm/{id}")
    public ModelAndView editIssueForm(@PathVariable Long id ){

                ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("issue_information");
        modelAndView.setViewName("editIssueForm");
        modelAndView.addObject("issue",iIssueManger.getById(id));
       return modelAndView;
    }



    @RequestMapping(value = "/updateIssue", method = RequestMethod.POST)
    public RedirectView updateIssue(@ModelAttribute Issue issue )
    {
        System.out.println("Issue from UI = " + issue);
        /*
         * Here you can write the code to save the user information in database
         */
        iIssueManger.save(issue);



        return new RedirectView("board");
    }

    @GetMapping("/deleteIssue/{id}")
    public RedirectView deleteIssue(@PathVariable Long id ){

iIssueManger.deleteById(id);

        return new RedirectView("/board");
    }



    @ModelAttribute("statuses")
    public List<String> statuses() {
        return Arrays.asList("BACKLOG", "TODO", "INPROGRESS", "DONE");
    }

}
