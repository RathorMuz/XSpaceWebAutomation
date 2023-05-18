package XSpace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class C360BuyerPlugin {

    public C360BuyerPlugin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='member-name']")
    public WebElement BuyerName;


    //Methods
    public void C360DarazPluginData(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='member-name']")));
        boolean Bname = BuyerName.getText().isEmpty();
        if(Bname == false)
        {
            Assert.assertFalse(Bname);
            System.out.println(BuyerName.getText());
        }
    }

}
