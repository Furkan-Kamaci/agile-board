package com.furkan.agile.board.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="issue")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Issue {
    @Id
    @Column(name = "issue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long issueId;
    @Column(name = "name")
    private String name;
    private String desc;
    @Enumerated(EnumType.STRING)
    private Status status;



}
