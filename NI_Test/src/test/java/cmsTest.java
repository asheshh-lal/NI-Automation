import elements.cms;
import elements.first;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class cmsTest extends base_test
{
    cms obj;
    cms.cmsElements cmsElements;

    @BeforeClass
    public void setup()
    {
        super.setup();
        obj = new cms(driver);
        obj.goToNi(driver);
        cmsElements=new cms.cmsElements(driver);
    }

    @Test
    public void test_title() throws InterruptedException
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        cmsElements.userName.sendKeys("ashesh.shrestha");
        cmsElements.pw.sendKeys("Rome666!");
        cmsElements.log.click();
        cmsElements.masterMode.click();
        cmsElements.logIn.click();
        Thread.sleep(20000);
        cmsElements.cms.click();
        Thread.sleep(6000);
        cmsElements.sdd.click();
        Thread.sleep(20000);
//        cmsElements.cmsP.click();
        cmsElements.spec.click();
        cmsElements.card.click();
        js.executeScript("arguments[0].scrollIntoView(true);", cmsElements.emb);
        cmsElements.emb.click();
    }
}
