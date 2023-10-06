package ch08;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 생성자에서 객체 초기화! = 모든 사용자 요청에 동일 인스턴스 사용!
		service = new ProductService();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String view = "";

		if (action == null) {
			getServletContext().getRequestDispatcher("/pcontrol?action=list").forward(request, response);
		} else {
			switch (action) {
			case "list":
				view = list(request, response);
				break;
			case "info":
				view = info(request, response);
				break;
			}
			getServletContext().getRequestDispatcher("/ch08/" + view).forward(request, response);
		}
	}

	// 전체 목록
	private String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("products", service.findAll()); // ${products}로 담음
		return "productList.jsp";
	}

	// 단일 목록
	private String info(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("p", service.find(request.getParameter("id"))); // ${p}로 담음
		return "productInfo.jsp";
	}

}
