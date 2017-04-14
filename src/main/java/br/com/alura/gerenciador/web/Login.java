package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javafx.geometry.HPos;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Tarefa{
  @Override
public String executa(HttpServletRequest req, HttpServletResponse resp)
{
	// TODO Auto-generated method stub
	String email=req.getParameter("email").replace(" ", "");
	String senha=req.getParameter("senha").replace(" ", "");
/*	PrintWriter escrever=resp.getWriter();
	escrever.println("<p>usuario digitado: "+email+" Senha digitada: "+senha+" </p>");
	*/
	Usuario user= new UsuarioDAO().buscaPorEmailESenha(email, senha);
	
	/*escrever.println("<!DOCTYPE html>");
	escrever.println("<html>");
	escrever.println("<head>");
	escrever.println("<meta charset='UTF-8'/>");
	escrever.println("<title>Autenticação</title>");
	escrever.println("</head>");
	escrever.println("<body>");
	*/
	
		
		/*Cookie cook=new Cookie("usuario.logado", user.getEmail());
		cook.setMaxAge(10*60);
		resp.addCookie(cook);	    
		escrever.println("<p>Usuario: "+user.getEmail()+", Logado");
		*/
	   //comentado
		
	   if(user!=null)
	   {
		HttpSession session=req.getSession();
		session.setMaxInactiveInterval(60*10);
		session.setAttribute("usuarioLogado", user);
	
		//fim do comentado
	   
	//escrever.println("</body>");
	//escrever.println("</html>");
		return "/WEB-INF/paginas/login.jsp";
	   }
	   else
	   {
		   return "/index.jsp";
	   }
}
}
