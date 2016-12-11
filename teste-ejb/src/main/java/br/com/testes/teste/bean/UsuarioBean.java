package br.com.testes.teste.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.testes.teste.service.UsuarioService;


@Stateless
@LocalBean
public class UsuarioBean implements UsuarioService {

	public String obterNomeUsuario(Long id) {
		return "usuario unico";
	}
	
}
