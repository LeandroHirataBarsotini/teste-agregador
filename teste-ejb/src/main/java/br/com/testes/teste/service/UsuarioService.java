package br.com.testes.teste.service;

import java.util.List;

import javax.ejb.Local;

import br.com.testes.teste.vo.UsuarioVO;

@Local
public interface UsuarioService {

	public String obterNomeUsuario(Long id);
	public List<UsuarioVO> listarUsuarios();
	public List<UsuarioVO> listarUsuariosPorNome(String nome);
	
}
