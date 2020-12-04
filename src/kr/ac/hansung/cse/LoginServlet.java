package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read form data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//process 디비접근, business logic수행
		//Build HTML code
		PrintWriter out =response.getWriter();
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is " +username+ "<br/>"; 
		htmlResponse += "<h2> Your password is " +password+ "<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
		//사용자입력과 유저네임과 패스워드에 따라사 항상 다른 페이지가 만들어지 것이다
		// 동적인 페이지
	}

}
