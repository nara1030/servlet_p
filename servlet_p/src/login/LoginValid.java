package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginValid extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);
		if(req.getParameter("id").equals("hje") && req.getParameter("pw").equals("hje")) {
			System.out.println("���̵� �� ��� ��ġ");
			resp.sendRedirect("/memlist.do");
			return;
		}
		System.out.println("���̵� �� ��� ����ġ");
		resp.sendRedirect("/login");
		return;
	}
}
