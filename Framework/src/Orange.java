import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\monika\\eclipse-workspace\\HelloWorld\\Framework\\orangeData.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		
		d.get(url);
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement e=(WebElement) d.findElement(By.xpath("//input[@name='username']"));
		d.findElement(By.xpath("//input[@name='password']"));
		d.findElement(By.xpath("//button[@type='submit']"));
		
		

	}

}
