package Webjump.qa_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebjumpPage {

	private static final String URL_WEBJUMP = "https://wejump-automation-test.github.io/qa-test/";
	
	private WebDriver browser;
	
	public WebjumpPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\breno\\eclipse-workspace\\Webjump\\drivers\\chromedriver.exe");
		this.browser = new ChromeDriver();
		this.browser.navigate().to(URL_WEBJUMP);
	}
	
	public void fechar() {
		this.browser.quit();	
	}

	public void clicarBotoesOneTwoFour() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		browser.findElement(By.id("btn_one")).click();
		browser.findElement(By.id("btn_two")).click();
		browser.findElement(By.id("btn_link")).click();
	}

	public boolean verificarPresencaDosBotoes() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean botaoOneMostrado = browser.findElement(By.id("btn_one")).isDisplayed();
		boolean botaoTwoMostrado = browser.findElement(By.id("btn_two")).isDisplayed();
		boolean botaoFourMostrado = browser.findElement(By.id("btn_link")).isDisplayed();
		
		return botaoOneMostrado && botaoTwoMostrado && botaoFourMostrado;
	}
	
	public WebDriver entrarNoIframe() {
		return browser.switchTo().frame(browser.findElement(By.xpath("//iframe[@src='buttons.html']")));
	}

	public void preencherCampoYourFirstName() {
		browser.findElement(By.id("first_name")).sendKeys("Lorem Ipsun");
	}

	public void clicarBotaoOne() {
		browser.findElement(By.id("btn_one")).click();	
	}

	public void selecionarExempleTwo() {
		WebElement selectElement = browser.findElement(By.id("select_box"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByValue("option_three");
	}
	
	public void checarOptionThree() {
		browser.findElement(By.id("opt_three")).click();
	}

	public boolean verificarPresencaImgSeleniumWebdriver() {
		boolean imagemSeleniumMostrada = browser.findElement(By.xpath("//img[@alt=\"selenium\"]")).isDisplayed();
		
		return imagemSeleniumMostrada;
	}
	

}
