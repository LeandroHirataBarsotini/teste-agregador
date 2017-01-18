package br.com.testes.teste.usuario;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.NamedQuery;

import br.com.testes.teste.service.UsuarioService;
import br.com.testes.teste.vo.UsuarioVO;

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
		List<UsuarioVO> usuarios  = usuarioService.listarUsuarios();
		
		if(usuarios != null) {
			for(UsuarioVO usuario : usuarios) {
				System.out.println(usuario.getNome());
			}
		}
		
		listarUsuariosPorNome();
		
		return usuarioService.obterNomeUsuario(1L);
	}
	
	public void listarUsuariosPorNome() {
		System.out.println("teste com @NamedQuery: " + usuarioService.listarUsuariosPorNome("NOME 1").size());
	}
	
}
