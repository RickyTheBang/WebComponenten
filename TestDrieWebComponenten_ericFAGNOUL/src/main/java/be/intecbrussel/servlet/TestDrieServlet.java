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

        //getSession() creert een nieuwe sessie
        // session.isNew() zal dus slechts 1 keer werken, de eerste keer dat je de pagina bezoekt, hierna heb je immers een sessie
        //beter is om een attribuut op te slaan in de session die bepaalt of je ingelogd bent of niet.
        HttpSession session = req.getSession ( );
        if (session.isNew ( )) {

            req.getRequestDispatcher ("WEB-INF/pages/login.jsp")
                    .forward (req, resp);
        } else {
            //dit stukje is overbodig, de jsp kan aan zowel session als request attributen.
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
            //deze message wordt enkel gereset wanneer een geldige gebruiker inlogt
            //wanneer je gewoon de pagina opnieuw bezoekt blijft dus in principe de message bestaan
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
