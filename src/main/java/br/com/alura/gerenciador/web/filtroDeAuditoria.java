package br.com.alura.gerenciador.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

public class filtroDeAuditoria implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filtro) throws IOException, ServletException {
		
		HttpServletRequest requisicao=(HttpServletRequest)req;
		String uri=requisicao.getRequestURI();
		
		/*Esse comando abaixo informa ao filtro para
		 * prosseguir e chamar as paginas 
		 * acionada pelas chamadas.
		 */
		filtro.doFilter(req, res);
		String usuario = retorna(requisicao);
		System.out.println("Usuario: "+usuario+",  está acessando: "+uri);
	}

	private String retorna(HttpServletRequest requisicao) {
		/*usando cookie estudo
		 * Cookie[] coockies=requisicao.getCookies();
		String usuario="<deslogado>";
		if(coockies!=null)
		{
			for(Cookie coockie : coockies)
			{
				if(coockie.getName().equals("usuario.logado"))
				{
					usuario=coockie.getValue();
				}
			}
		}
		*/
			Usuario usuario=(Usuario)requisicao.getSession().getAttribute("usuarioLogado");
			if(usuario==null)
			{
				return "<deslogado>";
			}
			
		return usuario.getEmail();
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
