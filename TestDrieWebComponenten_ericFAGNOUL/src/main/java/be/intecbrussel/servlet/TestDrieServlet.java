package be.intecbrussel.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet("/testdrie")
public class TestDrieServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession ( );
        if (session.isNew ( )) {

            req.getRequestDispatcher ("WEB-INF/pages/login.jsp")
                    .forward (req, resp);
        } else {
            req.setAttribute ("name", session.getAttribute ("sessionName"));
            req.getRequestDispatcher ("WEB-INF/pages/welcome.jsp")

                    .forward (req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession ( );
        String nameAttribute = req.getParameter ("name");
        String message = ", gelieve een geldige naam in te voeren!";
        if (nameAttribute.isEmpty ( )) {
            session.setAttribute ("message", message);
            req.getRequestDispatcher ("WEB-INF/pages/login.jsp")
                    .forward (req, resp);
        } else {
            session.setAttribute ("sessionName", nameAttribute);
            session.setAttribute ("message", "");
            req.getRequestDispatcher ("WEB-INF/pages/welcome.jsp")
                    .forward (req, resp);
        }
    }


}
