package XSpace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CaseCenter {


    public CaseCenter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //WebElements
    @FindBy(xpath = "//*[@href='#/system/ticket-search']")
    public WebElement CaseCenterIcon;
    @FindBy(xpath = "//div[contains(text(),'高级搜索')]//*[name()='svg']")
    public WebElement SearchExpand;
    @FindBy(xpath = "//div[@class='data-view']//div[2]//div[1]//div[2]//div[1]//div[1]//span[1]//i[1]//*[name()='svg']")
    public WebElement CaseTypeDD;
    @FindBy(xpath = "//li[text()='Refund Only']")
    public WebElement RefundOnlyOption;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']")
    public WebElement SearchButton;
    @FindBy(css = "div div.ant-select.ant-select-enabled.ant-select-allow-clear div.ant-select-selection.ant-select-selection--multiple div.ant-select-selection__rendered div.ant-select-selection__placeholder")
    public WebElement SearchCaseBar;
    @FindBy(css = "div.ant-select-search__field__wrap input")
    public WebElement SearchCaseBar1;
    @FindBy(xpath = "//a[text()='2500000108441061']")
    public WebElement ClickCase;
    @FindBy(xpath = "//div[@class='data-view']//div[3]//div[1]//div[2]//div[1]//div[1]//span[1]//i[1]//*[name()='svg']")
    public WebElement ChannelDD;
    @FindBy(xpath = "//i[@class='anticon anticon-close ant-select-remove-icon']")
    public WebElement CaseRemoveIcon;
    @FindBy(xpath = "//div[@role='tab']")
    public WebElement SearchedTab;



    //Methods
    public void clickCaseCenterIcon(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#/system/ticket-search']")));
        CaseCenterIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-select-selection__placeholder']")));
        Thread.sleep(4000);
        SearchCaseBar.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.ant-select-search__field__wrap input")));
        Thread.sleep(2000);

        //Case1: Search with case number
        SearchCaseBar1.sendKeys("2500000108441061");
        Thread.sleep(1000);
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        CaseRemoveIcon.click();
        Thread.sleep(1000);

        //Case2: Search with email
        SearchCaseBar1.sendKeys("mohammad.muzzamil@daraz.pk");
        Thread.sleep(1000);
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(4000);
        CaseRemoveIcon.click();


        //Expand search with case id
        SearchExpand.click();
        Thread.sleep(3000);
        SearchCaseBar1.sendKeys("2500000108441061");
        Thread.sleep(1000);
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        CaseRemoveIcon.click();

        //Expand Search with case type
        CaseTypeDD.click();
        Thread.sleep(3000);
        RefundOnlyOption.click();
        Thread.sleep(2000);
        SearchButton.click();
        String expected = SearchedTab.getText();
        Assert.assertEquals(RefundOnlyOption,expected);
        Thread.sleep(3000);
        CaseTypeDD.click();

        //Expand search with case channel
        ChannelDD.click();

    }


}
