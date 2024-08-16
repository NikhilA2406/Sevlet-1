import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*get method display the data whatever you have given for input in URL. If you did not specify the method in HTML code by default 
		 * it take get as method. As we know it is not safe to use so we have to always specify the method as post*/
		System.out.println("Control in Servlet/Controler");
		String name=request.getParameter("fullname");
		String email=request.getParameter("email");
		if(name.equals("Rohit")&&email.equals("Rohit@gmail.com"))
		{
			System.out.println("Success! he is the right Rohit");
		}
		else
		{
			System.out.println("Different Rohit");
		}
		
	}

}
