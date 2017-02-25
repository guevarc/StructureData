package fr.epita.carol.structuredData.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.epita.carol.structuredData.message.SuccessMessage;

/**
 * Servlet implementation class IdentityAction
 */
public class IdentityAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdentityAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SuccessMessage message = new SuccessMessage();
		message.setMessage("This identity has been successfully created");
		message.setComplementaryData(request.getParameter("displayName"));
		ObjectMapper objectMapper = new ObjectMapper();
		String result = objectMapper.writeValueAsString(message);
		response.getWriter().write(result);
		
	}

}
