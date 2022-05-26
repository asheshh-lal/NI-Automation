import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class base_test {
    public WebDriver driver;

    public void setup(){
        this.driver = driverSetup();
    }

    public WebDriver driverSetup()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

//    @AfterClass
//    public void closeBrowser(){
//        driver.close();
//    }

}
