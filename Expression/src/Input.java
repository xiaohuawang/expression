import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ServletAllPosts
 */
@WebServlet("/Input")
public class Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Input() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("doget");
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email= request.getParameter("email");
		
		HttpSession session = request.getSession();
		
	   User user = new User(firstname,lastname,email);
	   
		Address address = new Address("200 Skidmore Blvd", "Gaithersburg", "MD", "20877");
		
		user.setAddress(address);
	  // User user = new User(firstName, lastName, email);
		session.setAttribute("user", user);
		
		getServletContext().getRequestDispatcher("/display.jsp").forward(request, response);
		
	
		
		//forward it
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("dopost");
		doGet(request,response);
	}

}
