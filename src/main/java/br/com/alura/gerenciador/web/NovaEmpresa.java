package br.com.alura.gerenciador.web;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class NovaEmpresa implements Tarefa{


	@Override
public String executa(HttpServletRequest req, HttpServletResponse resp)
{
		String nomeEmpresa=req.getParameter("nome");
		Empresa emp=new Empresa(nomeEmpresa);
		new EmpresaDAO().adiciona(emp);
		req.setAttribute("empresa", nomeEmpresa);
		return "/WEB-INF/paginas/novaEmpresa.jsp";			
	}
}
