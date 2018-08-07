package FacebookTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginTest {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C://Browser_Drivers//chromedriver.exe");
    WebDriver driver = new ChromeDriver();              
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
    driver.findElement(By.name("firstname")).sendKeys("bharat");
    
    driver.findElement(By.name("lastname")).sendKeys("bilhore");
    
    driver.findElement(By.name("reg_email__")).sendKeys("bilhore3@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("Geetb@33");
    
    Select oSelect = new Select(driver.findElement(By.id("day")));

    oSelect.selectByIndex(0);
    Select oSelect1 = new Select(driver.findElement(By.name("birthday_month")));
    oSelect1.selectByIndex(0);
    
    Select oSelect2 = new Select(driver.findElement(By.name("birthday_year")));
    oSelect2.selectByIndex(0);
    driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
    driver.findElement(By.xpath("//*[@data-name='birthday_wrapper']/following-sibling::i[1]")).click();
    
   String error=  driver.findElement(By.xpath("//div[starts-with(text(),'Select your date of birth')]")).getText();
   System.out.println(error);
    /*driver.findElement(By.id("email")).sendKeys("geetb33@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Geetb@333");
    driver.findElement(By.xpath("//input[@type='submit']")).click();*/
    driver.quit();
  }
}
