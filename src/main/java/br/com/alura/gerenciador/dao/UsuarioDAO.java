package br.com.alura.gerenciador.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.gerenciador.Usuario;

public class UsuarioDAO {

	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("teste@teste.com.br", new Usuario("teste@teste.com.br","teste"));
		
	}

	public Usuario buscaPorEmailESenha(String email, String senha) {
		/*System.out.print("entrou no metodo buscar ");
		System.out.print("e-mail: "+email);
		System.out.print(" senha: "+senha);
		*/
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;
		
		return null;
	}

}
