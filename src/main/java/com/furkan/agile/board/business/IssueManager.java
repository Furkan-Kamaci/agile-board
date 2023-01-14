package com.furkan.agile.board.business;

import com.furkan.agile.board.entity.Issue;
import com.furkan.agile.board.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IssueManager implements IIssueService {

    @Autowired
    private IssueRepository issueRepository;

    public IssueManager(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }


    @Override
    public List<Issue> findAll() {
     return    issueRepository.findAll();
    }

    @Override
    public List<Issue> findAllBacklog() {
        List<Issue> listBacklogIssue = new ArrayList<>();

        List<Issue> issues = issueRepository.findAll();

        for( Issue i : issues){
         if( i.getStatus() == null  || i.getStatus().name() == "BACKLOG" )   listBacklogIssue.add(i);
        }


        return listBacklogIssue;
    }

    @Override
    public List<Issue> findAllTodo() {
        List<Issue> listTodoIssue = new ArrayList<>();

        List<Issue> issues = issueRepository.findAll();

        for( Issue i : issues){
            if( i.getStatus() != null  && i.getStatus().name() == "TODO" )   listTodoIssue.add(i);
        }


        return listTodoIssue;
    }

    @Override
    public List<Issue> findAllInProgress() {
        List<Issue> listInProgressIssue = new ArrayList<>();

        List<Issue> issues = issueRepository.findAll();

        for( Issue i : issues){
            if( i.getStatus() != null  && i.getStatus().name() == "INPROGRESS" )   listInProgressIssue.add(i);
        }


        return listInProgressIssue;
    }

    @Override
    public List<Issue> findAllDone() {
        List<Issue> listDoneIssue = new ArrayList<>();

        List<Issue> issues = issueRepository.findAll();

        for( Issue i : issues){
            if( i.getStatus() != null  && i.getStatus().name() == "DONE" )   listDoneIssue.add(i);
        }


        return listDoneIssue;
    }
}
