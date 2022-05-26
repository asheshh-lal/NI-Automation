package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class first
{
     firstElements firstElements;
     public first(WebDriver driver)
     {
          firstElements=new firstElements(driver);
     }
     public void goToNi(WebDriver driver)
     {
          driver.get("https://ni-dev.cotiviti.com/");
     }
     public static class firstElements{
          public firstElements(WebDriver driver)
          {
               PageFactory.initElements(driver,this);
          }
          @FindBy(xpath="//*[@id=\"username\"]")
          public WebElement userName=null;

          @FindBy(id="password")
          public WebElement pw=null;

          @FindBy(xpath="//*[@id=\"fm1\"]/div[3]/div[1]/input[3]")
          public WebElement log=null;

          @FindBy(id="toggle-master-mode")
          public WebElement masterMode=null;

          @FindBy(xpath="//*[@id=\"auth-content\"]/div/div[5]/div/button")
          public WebElement logIn=null;

          @FindBy(xpath = "//*[@id=\"MI\"]/img")
          public WebElement MI=null;

          @FindBy(xpath = "//*[@id=\"user-dropdown-toggle\"]/i")
          public WebElement downA=null;

          @FindBy(id = "switch-client")
          public WebElement switchC=null;

          @FindBy(xpath = "//*[@id=\"auth-content\"]/*/*/div")
          public WebElement selectC=null;

          @FindBy(id = "rowdmap-u")
          public WebElement niMap=null;

          @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
          public WebElement cms=null;


//          @FindBy(id = "//*[@id=\"auth-content\"]/div/div[3]/div/select/option[25]")
//          public WebElement clientFlorida=null;

     }

}
