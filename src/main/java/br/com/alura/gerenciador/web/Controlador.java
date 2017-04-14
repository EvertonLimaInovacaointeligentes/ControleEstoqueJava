package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet{
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException,IOException {
	// TODO Auto-generated method stub
	
	String tarefa=req.getParameter("tarefa");
	if(tarefa==null)
	{
		throw new IllegalArgumentException("Você esqueceu de passar a tarefa");
	}
	tarefa="br.com.alura.gerenciador.web."+tarefa;
	
		try
		{
	    Class<?> tipo=Class.forName(tarefa);
	    System.out.println("tarefa: "+tarefa);
		Tarefa instancia=(Tarefa)tipo.newInstance();
		String pagina=instancia.executa(req,resp);
		System.out.println("Pagina: "+pagina);
		RequestDispatcher dispather= req.getRequestDispatcher(pagina);
        dispather.forward(req,resp);				
		}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			throw new ServletException(e);
		}
}
}
