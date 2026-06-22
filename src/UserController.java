import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;

public class UserController {
    public ResultSet getUser(HttpServletRequest request, Connection connection) throws Exception {
        String userId = request.getParameter("id");
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM users WHERE id = " + userId;
        return statement.executeQuery(query);
    }

    public String redirectUser(HttpServletRequest request) {
        String redirectUrl = request.getParameter("url");
        return "redirect:" + redirectUrl;
    }
}
