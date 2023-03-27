# Agile Board

A simple agile development board as a Portfolio project.

Restful, 3 tier architecture. 
So database and front end can be replaced easily.

Database: H2 <br>
Back end: Spring Boot <br>
Front end: Thymeleaf <br>

All CRUD operations for "Issue". <br>

Suitable for single user. <br>


# To run with Docker
1 pull with the code: 
```.sh
docker pull foorcun/board_img
```
2 run with the code: 
```.sh
docker run -p 8080:8080 foorcun/board_img
```
3 go to the url: 
```.sh
http://localhost:8080/index
```


