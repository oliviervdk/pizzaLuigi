package be.vdab.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.htm")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html lang='nl'><head>");
		out.println("<title>Pizza Luigi</title></head>");
		out.println("<body><h1>");
		int uur = LocalDateTime.now().getHour();
		out.print(uur >= 6 && uur < 12 ? "Goede morgen" : uur >= 12 && uur < 18 ? "Goede Middag" : "Goede avond");
		out.println("</h1></body></html>");
	}

}
