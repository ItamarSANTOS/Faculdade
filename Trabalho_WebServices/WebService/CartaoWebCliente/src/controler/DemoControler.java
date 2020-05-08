package controler;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.*;
import entities.*;


/**
 * Servlet implementation class DemoControler
 * @param <DemoStub>
 */
public class DemoControler<DemoStub> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("txt/html");
		try {
			
			PcartaoWS ps;
			PcartaoWS p = ps.find(new find()).get_return();
			
			out.print("<3>Lista e Informações do Cartão</3>");
			out.print("<br>Id: </br>" + p.getIds());
			out.print("<br>Nome: </br>" + p.getNome());
			out.print("<br>Limite: </br>" + p.getSaldo());
			
			
		} catch (Exception e) {
			DemoStub ds = new DemoStub();
			out.print(getInitParameter(null));
			
			out.print(e.getMessage());
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
