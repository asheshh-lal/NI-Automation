package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cms
{
    cms.cmsElements cmsElements;
    public cms(WebDriver driver)
    {
        cmsElements= new cms.cmsElements(driver);
    }
    public void goToNi(WebDriver driver)
    {
        driver.get("https://pophealthproducts-uat.cotiviti.com/login?service=https%3A%2F%2Fni-dev.cotiviti.com%2Fcas%2Flogin%3Fnext%3D%252F&view=niLoginView");
    }
    public static class cmsElements{
        public cmsElements(WebDriver driver)
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


        @FindBy(xpath = "//div[contains(text(),'Insight Dashboard')]\n")
        public WebElement ins=null;

        @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
        public WebElement cms=null;

        @FindBy(xpath = "//span[contains(text(),'Network')]")
        public WebElement net=null;

        @FindBy(xpath = "//*[@id=\"items\"]/ul/li[7]/a/div/div[2]")
        public WebElement sdd=null;

//        @FindBy(xpath = "//span[contains(text(),'CMS Provider')]")
//        public WebElement cmsP=null;

        @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[4]/div/div/div[4]/div[3]/div[1]")
        public WebElement spec=null;

        @FindBy(xpath = "/html/body/span/span/span/ul/li[3]\n")
        public WebElement card=null;

        @FindBy(xpath = "//*[@id=\"modal\"]/div/div/div/div/div[7]/button")
        public WebElement emb=null;

        //body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/svg[1]/g[15]/circle[2]
//          @FindBy(id = "//*[@id=\"auth-content\"]/div/div[3]/div/select/option[25]")
//          public WebElement clientFlorida=null;

    }
}
