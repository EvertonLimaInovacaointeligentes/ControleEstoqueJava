package br.com.alura.gerenciador.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;


public class BuscaEmpresa implements Tarefa{

/*protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {	
	  String filtro=req.getParameter("filtro");
	  Collection<Empresa>lista= new EmpresaDAO().buscaPorSimilaridade(filtro);
	  RequestDispatcher dispacher=req.getRequestDispatcher("/WEB-INF/paginas/buscaEmpresas.jsp");
	  req.setAttribute("empresas", lista);
	  dispacher.forward(req, resp);
	  
}
*/
@Override
public String executa(HttpServletRequest req, HttpServletResponse resp) {
	// TODO Auto-generated method stub
	  String filtro=req.getParameter("filtro");
	  Collection<Empresa>lista= new EmpresaDAO().buscaPorSimilaridade(filtro);	  
	  req.setAttribute("empresas", lista);
	  
	
	return "/WEB-INF/paginas/buscaEmpresas.jsp";
}
}
