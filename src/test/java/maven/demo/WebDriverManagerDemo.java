package maven.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();			
		WebDriver driver = new EdgeDriver();
		driver.get("https://github.com/SagarBobade");
	}

}
