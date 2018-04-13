package pages;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class EndTest {
	
	public static void stopTest(WebDriver driver){
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

}
