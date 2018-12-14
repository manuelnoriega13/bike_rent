# bike_rent
A company rents bikes under following options:

1. Rental by hour, charging $5 per hour
2. Rental by day, charging $20 a day
3. Rental by week, changing $60 a week
4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price

# Assigment:
1. Implement a set of classes to model this domain and logic
2. Add automated tests to ensure a coverage over 85%
3. Use GitHub to store and version your code
4. Apply all the recommended practices you would use in a real project
5. Add a README.md file to the root of your repository to explain: your design, the development practices you applied and how run the tests.

Note: we don't expect any kind of application, just a set of classes with its automated tests.

# Deliverables:
The link to your repository 

#files 

#Framework, libraries etc
Spring Boot 2.1.1
Spring Data
Spring mvc
Mysql 
Lombok
java 1.8
maven

#Project struct
you will find folders (layers)
use a data access object to keep the business layer 
separate with the information and model view controller
you can find all proyect tree files in tree_file.txt

#run proyect 
1) you need to upload bike_rent.sql in your mysql server 
using this command
mysql -u USER -p bike_rent < bike_rent.sql

2)to make run the project execute
mvn package 
that will generate .jar
run using java -jar FileName.jar
