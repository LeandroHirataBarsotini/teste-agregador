package br.com.testes.teste.bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import br.com.testes.teste.service.UsuarioService;
import br.com.testes.teste.util.Constants;
import br.com.testes.teste.vo.UsuarioVO;


@Stateless
@LocalBean
public class UsuarioBean implements UsuarioService {

	//private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT_NAME);
	//private EntityManager em = factory.createEntityManager();
	
	@PersistenceContext(unitName=Constants.PERSISTENCE_UNIT_NAME, type=PersistenceContextType.TRANSACTION)
	private EntityManager em;
	
	public String obterNomeUsuario(Long id) {
			
		Query q = em.createQuery("select u from UsuarioVO u where u.codigo = :CODIGO");
		q.setParameter("CODIGO", id);
		
		UsuarioVO usuario = (UsuarioVO) q.getSingleResult();
		
		if(usuario != null) {
			return usuario.getNome();
		} else {
			return null;
		}
		
	}
	
	public List<UsuarioVO> listarUsuarios() {
    	
		Query q = em.createQuery("select u from UsuarioVO u");
		
		return q.getResultList();
		
	}
	
	public List<UsuarioVO> listarUsuariosPorNome(String nome) {

		Query q = em.createNamedQuery("usuariosPorNome");
		q.setParameter("NOME_USUARIO", nome);
		
		return q.getResultList();
		
	}
	
}
