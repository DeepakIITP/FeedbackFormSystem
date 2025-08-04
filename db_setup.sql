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