package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;

public class logout implements Tarefa{
	@Override
public String executa(HttpServletRequest req, HttpServletResponse resp) {
 
        //gravar cookies
		/*Cookie[]cookies=req.getCookies();
		for (Cookie cookie : cookies) {
		    if(cookie.getName().equals("usuario.logado"))
		    {
		    	cookie.setMaxAge(0);
		    	resp.addCookie(cookie);
		    }
		}
		*/
		//usado somente para remover o atributoda sessao
		req.getSession().removeAttribute("usuarioLogado");
		//metodo usado para quando o cliente seja redirecionado para a pagina
		//resp.sendRedirect("paginas/logout.html");
		//pode ser usado para realmete invalidar e remover tudo da sessao  
		//req.getSession().invalidate();
		 return "/WEB-INF/paginas/logout.jsp";
		 
		
	}
}
