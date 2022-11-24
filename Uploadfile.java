import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Uploadfile {
	
	public static WebDriver driver;
	
	static String path = "D:\\\\chromedriver_win32 (6)\\\\chromedriver.exe";
	
	static String Url = "http://www.fileconvoy.com/";
	
	
	
@Test
	public static void A() {
		
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();

	}
@Test
    public static void B() {
	
	   driver.findElement(By.id("upfile_0")).sendKeys("C:\\Users\\VIGNESH SUNDAR RAJ\\Desktop\\Testdemo.docx"); // File location and file name
	
	
}

}
