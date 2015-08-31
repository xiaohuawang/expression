

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class User  {

		
	private String firstname="";
	private 	String lastname=""; 
	private 	String email = "";
	private    Address address;
		
		public Address getAddress()
		{
			return address;
		}

		public void setAddress(Address address)
		{
			this.address = address;
		}

		
		public String getFirstname() {
			return this.firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname= firstname;
		}

		public String getLastname() {
			return this.lastname;
		}
		
		public void setLastname(String lastname) {
			this.lastname= lastname;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

		public String setEmail() {
			return this.email;
		}
		
		public User(String firstname, String lastname, String email)
		{
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
		}
		
		
		
		
}



