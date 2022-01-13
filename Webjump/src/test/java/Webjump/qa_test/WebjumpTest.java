package Webjump.qa_test;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;


public class WebjumpTest {
	
	private WebjumpPage paginaWebjump;
	
	@Before
	public void beforeEach() {
		this.paginaWebjump = new WebjumpPage();
	}

	@After
	public void afterEach() {
		this.paginaWebjump.fechar();
	}
	
	@Test
	public void deveriaClicarNosBotoes() {	
		this.paginaWebjump.clicarBotoesOneTwoFour();
		boolean validacaoBotoesPresentes = paginaWebjump.verificarPresencaDosBotoes();
		Assert.assertFalse(validacaoBotoesPresentes);
	}
		
	@Test
	public void deveriaClicarNosBotoesDoIframeButtons() {
		this.paginaWebjump.entrarNoIframe();
		this.paginaWebjump.clicarBotoesOneTwoFour();
		boolean validacaoBotoesIframePresentes = paginaWebjump.verificarPresencaDosBotoes();
		Assert.assertFalse(validacaoBotoesIframePresentes);
	}
	
	@Test
	public void cenarioFinal() {
		this.paginaWebjump.preencherCampoYourFirstName();
		this.paginaWebjump.clicarBotaoOne();
		this.paginaWebjump.checarOptionThree();
		this.paginaWebjump.selecionarExempleTwo();
		boolean validacaoPresencaImgSelenium = paginaWebjump.verificarPresencaImgSeleniumWebdriver();
		
		Assert.assertTrue(validacaoPresencaImgSelenium);
	}
}

