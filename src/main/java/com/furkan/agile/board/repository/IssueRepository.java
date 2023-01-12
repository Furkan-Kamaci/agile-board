package com.furkan.agile.board.repository;

import com.furkan.agile.board.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
