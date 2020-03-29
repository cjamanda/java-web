package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;


@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		int populacao = Integer.parseInt(request.getParameter("populacao"));
		double area = Double.parseDouble(request.getParameter("area"));
		
		Pais pais = new Pais();
		
		pais.setArea(area);
		pais.setNome(nome);
		pais.setPopulacao(populacao);
		
		PaisService paisService = new PaisService();
		
		paisService.criar(pais);
		pais = paisService.procurar(pais.getNome());
		
		request.setAttribute("pais",pais);
		
		RequestDispatcher view = request.getRequestDispatcher("Pais.jsp");
		view.forward(request,response);
		
		/*PrintWriter out = response.getWriter();
		out.println("<html> <head> <title> Cadastro efetuado com sucesso </title> </head> <body>");
		out.println("<h1> Registro cadastrado </h1>");
		out.println(	"id: "+pais.getId()+"<br>");
		out.println(	"nome: "+pais.getNome()+"<br>");
		out.println(	"fone: "+pais.getPopulacao()+"<br>");
		out.println(	"e-mail: "+pais.getArea()+"<br>");
		out.print("</body> </html>");*/
	}

}
