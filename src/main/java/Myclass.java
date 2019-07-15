import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;

public class Myclass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		String testUrl = "https://boutique.arte.tv/";

		// Lance Chrome 
        driver.get(baseUrl);

        // Je sélectionne le bouton "j'ai de la chance"
        WebElement element = driver.findElements(By.name("btnI")).get(0);
        
        // Je sélectionne le champ de recherche
        WebElement q = driver.findElement(By.name("q"));
        
        // Je clique sur le champ de recherche
        q.click();
        
        // J'écris "arte boutique" dans le champ de recherche
        q.sendKeys("arte boutique");
        
        try {
        	Thread.sleep(1000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        
        // Je clique sur le bouton "j'ai de la chance"
        element.click();
        
        
        // Je récupère l'url  
        String title = driver.getCurrentUrl();
        
        // Je le compare à "https://boutique.arte.tv/" afin de m'assurer qu'il s'agit bien de la bonne page  
        if (title.contentEquals(testUrl))
        	System.out.println("Test Réussi");
        else
        	System.out.println("Test Echoué");
     
	} 

}