package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");	// �߰��ϴ� �ѱ� ����� ����
		PrintWriter pw = resp.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>");
        pw.println("�α��� ��");
        pw.println("</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<form action='login.do' method='post'>");
        pw.print("<label>���̵�: ");
        pw.println("<input type='text' name='id'></label><br>");
        pw.print("<label>��й�ȣ: ");
        pw.println("<input type='text' name='pw'></label><br>");
        pw.println("<input type='submit' value='����'>");
        pw.println("</form>");
        pw.println("</body>");
        pw.println("</html>");
	}
}
