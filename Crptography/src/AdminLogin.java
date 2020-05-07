

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		int s=3;
		String email="manishraj@gmail.com";
		String password="Manish@29";
		System.out.println("Cipher: " + CaesarCipher.encrypt(email, s)); 
		System.out.println("Cipher: " + CaesarCipher.encrypt(password, s)); 
		if(email.equals("manishraj@gmail.com")&&password.equals("Manish@29"))
		
		{
			
			
			HttpSession session=request.getSession();
			session.setAttribute("admin","true");
		
		}else{
	        out.println("<h1>Sorry, username or password error!</h1>");
		}
			
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
 
}
