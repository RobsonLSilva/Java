package controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

import model.DAO;
import model.JavaBeans;


//@WebServlet(urlPatterns = {"/Controller","/main","/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans contato = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// teste conexao
		// dao.testeConexao();
		String action = request.getServletPath();
		if (action.equals("/main")) {
			this.contatos(request, response);
		} else if (action.equals("/insert")) {
			this.novoContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	// Listar contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ira receber os dados JavaBeans
		ArrayList<JavaBeans> lista = dao.listarContatos();
		//teste de recebimento da lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getIdcon());
			System.out.println(lista.get(i).getNome());
			System.out.println(lista.get(i).getFone());
			System.out.println(lista.get(i).getEmail());
		}

	}

	// Novo contato
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		
		//invocar m�todo inserirContato passando o objeto contato
		dao.inserirContato(contato);
		
		//redirecionar para o documento agenda.jsp
		
		response.sendRedirect("main");
		
	}

}