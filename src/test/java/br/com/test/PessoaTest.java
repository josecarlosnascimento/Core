package br.com.test;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import br.com.base.service.PessoaService;

public class PessoaTest {

	public static void main(String[] args) {

		Weld weld = new Weld();
		WeldContainer weldContainer = weld.initialize();
		
		PessoaService ps =  weldContainer.instance().select(PessoaService.class).get();
		
		ps.insert(null);
		

	}

}
