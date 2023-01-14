DROP TABLE IF EXISTS issue;



--CREATE TABLE task (
--  id          INTEGER PRIMARY KEY,
--  description VARCHAR(64) NOT NULL,
--  completed   BIT NOT NULL);
--
--CREATE TABLE employees ( id INT AUTO_INCREMENT PRIMARY KEY,first_name VARCHAR(250) NOT NULL, last_name VARCHAR(250) NOT NULL,mail VARCHAR(250) NOT NULL, password VARCHAR(250) NOT NULL );

CREATE TABLE issue (
 issue_id INTEGER AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
 `desc` TEXT,
Status VARCHAR(10)
  );


--DROP TABLE IF EXISTS issue_backlog;
--
--
--CREATE TABLE issue_backlog (
--issue_backlog_id INTEGER AUTO_INCREMENT PRIMARY KEY,
--issue_id INTEGER,
-- Name VARCHAR(50)
--
-- );
--
--ALTER TABLE issue_backlog ADD (
--CONSTRAINT issue_backlog_reg_fk FOREIGN KEY (issue_id)
--          	  REFERENCES issue(issue_id)
--    )
--;