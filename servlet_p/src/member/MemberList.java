package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");	// �߰��ϴ� �ѱ� ����� ����
		PrintWriter pw = resp.getWriter();
		pw.print("���");
		
		resp.sendRedirect("index.html");
		System.out.println("���");
	}
}
