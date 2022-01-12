

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPointServlet
 */
@WebServlet("/getShopInfo")
public class GetShopInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String TENPO_ID=request.getParameter("TENPO_ID");
		request.setAttribute("TENPO_ID", TENPO_ID);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/getShopInfo.jsp");
		rd.forward(request, response);
	}

}
