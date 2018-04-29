import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", urlPatterns = "/bb")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double Rate = Double.parseDouble(request.getParameter("Rate"));
        double USA = Double.parseDouble(request.getParameter("USA"));

        PrintWriter writer = response.getWriter();
        double vnd = Rate * USA;
        writer.println("<html>");
        writer.println("Rate: " + Rate +"<br>");
        writer.println("USA: " + USA +"<br>");
        writer.print("VND: " + vnd +"<br>");
        writer.print("</html>");
    }
}
