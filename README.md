# Digital Feedback Collection System

The Digital Feedback Collection System is a full-stack web application designed to gather user feedback in a structured, interactive, and responsive manner. It enables users to submit reviews across multiple steps using a star rating system, provide written feedback (positive, negative, and suggestions), and optionally upload a supporting file.

The front end is developed using HTML and Tailwind CSS, offering a clean and mobile-friendly interface. JavaScript powers dynamic form navigation, client-side validation, and UI interactivity. The form spans three steps — personal details, service ratings, and open-ended feedback.

Once submitted, the form data is sent to a Java Servlet (FeedbackServlet.java) using the POST method. The servlet processes the data and stores it into a MySQL database using JDBC. Data is stored securely in a table called feedback within the feedback_db database.

The system includes:

- A multi-step form with animated transitions
- Star-based rating inputs for three key questions
- Real-time form validation and error prompts
- Optional file upload support
- Contact permission checkbox
- Java backend with JDBC integration
- MySQL database for persistent storage

This project serves as a foundational example of how to build a modern full-stack feedback platform using Java Servlets and relational databases while keeping the user interface intuitive and responsive.
