package br.com.test;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import br.com.base.service.PessoaService;

public class PessoaTest {
	
	@Test
	public void inserirPessoa() {
		
		Weld weld = new Weld();
		WeldContainer weldContainer = weld.initialize();
		
		PessoaService ps =  weldContainer.instance().select(PessoaService.class).get();
		
		ps.insert(null);
	}


}
