import static org.junit.Assert.*;



import java.io.File;
import java.sql.Driver;
import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.nio.file.Files;
import java.util.logging.Logger;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.interactions.Actions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import com.google.common.io.Files;


public class Bancointer {
	
	static WebDriver driver;	
	@Before
	public void setUp() throws Exception {
		
		//codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		// comando para chamar o drive dentro do before
		
		driver = new ChromeDriver();
		//comando para indicar URL
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		//comando para maximizar a tela 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"bt_gerar_pessoa\"]")).click();
		Thread.sleep(1000);
		String nome = driver.findElement(By.xpath("//*[@id=\"nome\"]/span[1]")).getText();
		String celular = driver.findElement(By.xpath("//*[@id=\"celular\"]/span[1]")).getText();
		String email = driver.findElement(By.xpath("//*[@id=\"email\"]/span[1]")).getText();
		String cpf = driver.findElement(By.xpath("//*[@id=\"cpf\"]")).getText();
		String dataNascimento = driver.findElement(By.xpath("//*[@id=\"data_nasc\"]/span[1]")).getText();
		// comando para indicar a nova URL
		driver.get("https://www.bancointer.com.br/");
		//comando para maximizar a nova tela
		driver.manage().window().maximize();
		//comando para interagir com o elemento
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("nome")).sendKeys(nome);
		driver.findElement(By.id("celular")).sendKeys(celular);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.id("dataNascimento")).sendKeys(dataNascimento);
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
	    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button")).click();
	    
	        	
			}
   
	
		

	@After
	public void after() throws Exception {
		
	            	    	
	 driver.quit();
	    }
	
	
   

	@Test
	public void test()throws InterruptedException  {
		
		
		Thread.sleep(5000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
		System.out.println(texto);
		assertEquals(texto,"Prontinho! Recebemos os seus dados.");
		
		    	
	}

	public static class ExemploTeste {

	    private static final Logger LOGGER = Logger.getLogger(ExemploTeste.class.getName());

	@Test
	
	
    public void teste1() throws IOException, InterruptedException {				
			
		
			// Configuração antes dos testes
		public class {
		public static void(String[] args) 	 IOException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
       
        // Teste 2
        
		driver.get("https://www.bancointer.com.br/");
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.co(f, new File("C:\\Users\\User\\CapturarImagem.jpg"));
		
		Thread.sleep(5000);
		
        
     // Configuração após os testes
       
        driver.quit();
    }      	    	
		
	 
	}
	
}
	    






		


		
		
						
			
	



