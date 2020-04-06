package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Person> people = new ArrayList<>();
        people.add(new Person("Julia", "Minka", "jminka@gmail.com"));
        people.add(new Person("Karol", "Szamelak", "kszamelak@gmail.com"));
        people.add(new Person("Sylwia", "Bilon", "sbilon@gmail.com"));
        people.add(new Person("Wiktoria", "Kowalska", "wkowal@gmail.com"));
        people.add(new Person("Alicja", "Lizak", "alizak@gmail.com"));
        people.add(new Person("Kacper", "Linka", "klinkak@gmail.com"));
        
        request.setAttribute("people", people);
        
        request.getRequestDispatcher("personList.jsp").forward(request, response);
    }
}
