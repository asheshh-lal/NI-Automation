import elements.first;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class firstTest extends base_test
{
    first obj;
    first.firstElements firstElements;

    @BeforeClass
    public void setup()
    {
        super.setup();
        obj = new first(driver);
        obj.goToNi(driver);
        firstElements=new first.firstElements(driver);
    }

    @Test
    public void test_title() throws InterruptedException {
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].scrollIntoView(true);", elements);
          firstElements.userName.sendKeys("ashesh.shrestha");
          firstElements.pw.sendKeys("Rome666!");
          firstElements.log.click();
          firstElements.masterMode.click();
          firstElements.logIn.click();
          Thread.sleep(6000);
          firstElements.MI.click();
          Thread.sleep(10000);
          ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
          driver.switchTo().window(tabs.get(1));
          driver.close();
            Thread.sleep(3000);
            driver.switchTo().window(tabs.get(0));
            firstElements.downA.click();
            firstElements.switchC.click();
            firstElements.selectC.click();
            firstElements.masterMode.click();
            firstElements.logIn.click();
            Thread.sleep(6000);
            firstElements.downA.click();
            firstElements.niMap.click();
            Thread.sleep(10000);
            ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.close();
            Thread.sleep(3000);
            driver.switchTo().window(tabs.get(0));
            firstElements.cms.click();
    }
}
