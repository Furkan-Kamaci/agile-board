package com.furkan.agile.board.business;

import com.furkan.agile.board.entity.Issue;

import java.util.List;

public interface IIssueService {
    List<Issue> findAll();
    List<Issue> findAllBacklog();

    List<Issue> findAllTodo();
     List<Issue> findAllInProgress();

    List<Issue> findAllDone();

    void save(Issue issue);

    Issue getById(Long id);

    void deleteById(Long id);
}
