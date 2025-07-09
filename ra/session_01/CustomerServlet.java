package ra.session_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers=new ArrayList<>();
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            customers.add(new Customer(1, "Nguyễn Văn A", sdf.parse("1990-01-01"),"Hà Nội","image"));
            customers.add(new Customer(2, "Nguyễn Văn B", sdf.parse("1991-02-02"),"Đà Nẵng","image"));
            customers.add(new Customer(3, "Nguyễn Văn C", sdf.parse("1992-03-03"),"Sài Gòn","image"));
            customers.add(new Customer(4, "Nguyễn Văn D", sdf.parse("1993-04-04"),"Sài Gòn","image"));
            customers.add(new Customer(5, "Nguyễn Văn F", sdf.parse("1994-05-05"),"Sài Gòn","image"));
        }catch (Exception e){
            e.printStackTrace();
        }

        request.setAttribute("customerList", customers);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }
}
