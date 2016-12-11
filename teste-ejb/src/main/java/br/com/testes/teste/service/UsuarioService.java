package br.com.testes.teste.service;

import javax.ejb.Local;

@Local
public interface UsuarioService {

	public String obterNomeUsuario(Long id);
	
}
