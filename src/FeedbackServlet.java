import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String department = request.getParameter("department");
            String date = request.getParameter("date");
            String overallRating = request.getParameter("overallRating");
            String responseRating = request.getParameter("responseRating");
            String recommendRating = request.getParameter("recommendRating");
            String positive = request.getParameter("feedbackPositive");
            String negative = request.getParameter("feedbackNegative");
            String suggestions = request.getParameter("feedbackSuggestions");
            String contactPermission = request.getParameter("contactPermission");

            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver name
            try (
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/feedback_db", "root", "password");
                    PreparedStatement ps = con.prepareStatement(
                            "INSERT INTO feedback (name, email, department, date, overallRating, responseRating, recommendRating, positive, negative, suggestions, contactPermission) "
                                    +
                                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, department);
                ps.setString(4, date);
                ps.setString(5, overallRating);
                ps.setString(6, responseRating);
                ps.setString(7, recommendRating);
                ps.setString(8, positive);
                ps.setString(9, negative);
                ps.setString(10, suggestions);
                ps.setString(11, contactPermission);

                ps.executeUpdate();
                out.println("Feedback Submitted Successfully");
            }

        } catch (Exception e) {
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
