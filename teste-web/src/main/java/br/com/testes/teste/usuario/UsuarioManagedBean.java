package br.com.testes.teste.usuario;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import br.com.testes.teste.service.UsuarioService;

@ManagedBean(name="usuarioManagedBean")
@RequestScoped
public class UsuarioManagedBean {

	@EJB
	private UsuarioService usuarioService;
	
	private String pagina1 = "/pages/usuario/usuario.xhtml";
	
	public String exibirNomeUsuario() {
		return pagina1;
	}
	
	public String getNomeUsuario() {
		return usuarioService.obterNomeUsuario(1L);
	}
	
}
