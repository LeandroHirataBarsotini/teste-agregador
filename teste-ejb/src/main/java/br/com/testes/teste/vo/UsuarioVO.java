package br.com.testes.teste.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_USUARIO")
public class UsuarioVO {

	@Id
	@Column(name = "COD_USUARIO")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_USUARIO")
	@SequenceGenerator(name="SEQ_USUARIO", sequenceName="SEQ_USUARIO")
	private Long codigo;
	
	@Column(name = "NOM_USUARIO")
	private String nome;
	
	@Column(name = "DES_EMAIL")
	private String email;
	
	@Column(name = "DES_SENHA")
	private String senha;
	
	@Column(name = "DAT_CRIACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
