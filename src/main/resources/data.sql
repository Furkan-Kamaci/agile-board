INSERT  INTO  issue (name, `desc`) VALUES ('data modelling', 'Model should contain: IssueId as Primary key, IssueName, Description as Desc, Status. Naming convention should be snake_case.'
);
--INSERT INTO employees (first_name, last_name, mail, password) VALUES ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent');

--INSERT  INTO  issue (Name, `Desc`, Status) VALUES ('A','B','C');



UPDATE issue
SET
    Status = 'TODO'
WHERE
    issue_id= 1;



insert into issue (name,`desc`)
values ('create SpringBoot project', '-java 17 -maven -group id: com.furkan.agile -Artifact: board -packaging: jar -dependencies: [web, mysql, jdbc, h2');