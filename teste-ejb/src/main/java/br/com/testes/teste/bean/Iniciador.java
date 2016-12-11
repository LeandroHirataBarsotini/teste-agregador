package br.com.testes.teste.bean;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Singleton
@Startup
public class Iniciador {

	//private static Logger LOGGER = Logger.getLogger(Iniciador.class);
	
	@PostConstruct
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void init() {
		//LOGGER.info("inicia diacho");
		System.out.println("inicia diacho");
	}
	
}
