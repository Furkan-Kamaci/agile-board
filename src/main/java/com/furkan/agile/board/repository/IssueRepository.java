package com.furkan.agile.board.repository;

import com.furkan.agile.board.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
