#Digital Feedback Collection System

This is a web-based Feedback Form System developed using Java Servlets, JDBC, and MySQL. It allows users to submit structured feedback through a multi-step HTML form with star ratings, text inputs, and file upload support. The feedback is stored in a MySQL database for analysis and reporting.

* Live Demo

Access the deployed feedback form here:

* https://feedbackformsystem.netlify.app/

* Features
 
Multi-step feedback form with validation

Star-rating system for experience evaluation

Optional file upload (PDF/DOC/JPG/PNG)

Backend powered by Java Servlets (JSP-free)

Data stored securely in a MySQL database

Platform-independent and lightweight

* Tech Stack

Frontend: HTML, Tailwind CSS, JavaScript

Backend: Java Servlet (JDK 8+)

Database: MySQL 5.7+ or 8.x

Server: Apache Tomcat 8.5+ or 9.x

JDBC Driver: MySQL Connector/J

* Project Structure

YourProject/

├── src/

│ └── FeedbackServlet.java

├── WebContent/

│ ├── index.html

│ └── WEB-INF/

│ ├── web.xml

│ └── lib/

│ └── mysql-connector-java-8.x.x.jar

├── db_setup.sql

└── README.md

* Prerequisites

Before you begin, ensure you have the following installed:

Java JDK 8 or higher

Apache Tomcat (8.5 or later)

MySQL Server

Eclipse or any Java IDE (with Dynamic Web Project support)

MySQL Connector/J .jar file

Download the JDBC driver from:

https://dev.mysql.com/downloads/connector/j/

Choose: Platform Independent → ZIP → extract → use the .jar inside.

* Setup Instructions

Clone or download this repository.

Create the database and table:

Use db_setup.sql to create the required database and table:

sql

CREATE DATABASE IF NOT EXISTS feedback_db;

USE feedback_db;

CREATE TABLE IF NOT EXISTS feedback (

id INT AUTO_INCREMENT PRIMARY KEY,

name VARCHAR(100),

email VARCHAR(100),

department VARCHAR(100),

date DATE,

overallRating VARCHAR(10),

responseRating VARCHAR(10),

recommendRating VARCHAR(10),

positive TEXT,

negative TEXT,

suggestions TEXT,

contactPermission VARCHAR(10)

);

Update database credentials:

In FeedbackServlet.java, update:

Connection con = DriverManager.getConnection(

"jdbc:mysql://localhost:3306/feedback_db", "root", "your_mysql_password");

Import the project:

Open Eclipse or IntelliJ IDEA.

Import as a Dynamic Web Project.

Ensure Java Build Path includes mysql-connector-java-x.x.x.jar under WEB-INF/lib.

Deploy to Tomcat:

Right-click project → Run As → Run on Server.

Or copy WAR file to Tomcat's webapps directory.

Access the form:

Open a browser and navigate to:

http://localhost:8080/YourProjectName/index.html

* How to Submit Feedback

Fill in your name, email, department, and date.

Rate your experience using stars.

Provide optional comments and suggestions.

Optionally upload a file.

Submit — data will be stored in the MySQL database.

* Notes
Form validations are handled with JavaScript.

Servlet handles form submission via POST at /submit-feedback.

File uploads are not saved in this version (extend using Apache Commons FileUpload if needed).

* Contact
For support or queries, please contact:

[DEEPAK ASHOK MODI]

Email: deepak_2312res235@iitp.ac.in
