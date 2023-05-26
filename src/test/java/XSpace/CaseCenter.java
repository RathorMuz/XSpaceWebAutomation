package XSpace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    //CaseSearchWebElements
    @FindBy(xpath = "//*[@href='#/system/ticket-search']")
    public WebElement CaseCenterIcon;
    @FindBy(xpath = "//div[contains(text(),'Advanced Search')]//*[name()='svg']")
    public WebElement SearchExpand;
    @FindBy(xpath = "//div[contains(text(),'高级搜索')]//*[name()='svg']")
    public WebElement SearchExpand1;
    @FindBy(xpath = "//div[contains(text(),'Switch to Advanced Search')]//*[name()='svg']")
    public WebElement SearchExpand2;
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

    //CaseCreationWebElements

    //@FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__entry > div.mr-fab__menus > div:nth-child(1) > div.mr-fab-menu__icon > svg > use")
    @FindBy(css = "div.mr-fab__menu.mr-fab__ball svg.icon-svg")
    public WebElement FabIcon;
    @FindBy(css = "div.mr-fab__menus div.mr-fab__menu:nth-child(1) div.mr-fab-menu__icon svg.icon-svg")
    public WebElement CreateCase;



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
        if(SearchExpand.isDisplayed())
        {
            SearchExpand.click();
        }
        else if (SearchExpand1.isDisplayed())
        {
            SearchExpand1.click();
        }
        else
        {
            SearchExpand2.click();
        }
        Thread.sleep(3000);
        SearchCaseBar1.sendKeys("2500000108441061");
        Thread.sleep(1000);
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        CaseRemoveIcon.click();


        //Expand Search with case type
        Thread.sleep(2000);
        CaseTypeDD.click();
        Thread.sleep(2000);
        RefundOnlyOption.click();
        Thread.sleep(2000);
        SearchButton.click();
        String expected = SearchedTab.getText();
        Assert.assertEquals(RefundOnlyOption.getText(),expected);
        Thread.sleep(3000);
        CaseTypeDD.click();
        Thread.sleep(2000);

        //Expand search with case channel
        //ChannelDD.click();

    }
        public void CreateCase(WebDriver driver) throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(FabIcon).perform();
            CreateCase.click();
            action.moveToElement(FabIcon).moveToElement(CreateCase).click().build().perform();
            Thread.sleep(1000);
            //action.moveToElement(we).moveToElement(driver.findElement(By.cssSelector("#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__entry > div.mr-fab__menus > div:nth-child(1) > div.mr-fab-menu__icon > svg > use"))).click().build().perform();
            //WebDriverWait wait = new WebDriverWait(driver,60);
            //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__entry > div.mr-fab__menu.mr-fab__ball > div.mr-fab-menu__icon > svg > use")));
           // FabIcon.click();
        }

      //  @FindBy(xpath ="//*[@class=\"mr-fab__menu \"]//*[@class=\"mr-fab-menu__icon\"]//*[@class=\" icon-svg\" and @data-spm-anchor-id]")
    //    public WebElement CreateCase;
  //      public void clickCreateCase(WebDriver driver) throws InterruptedException {
//
            //WebDriverWait wait = new WebDriverWait(driver, 30);
            //Thread.sleep(1000);
           // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"mr-fab__menu \"]//*[@class=\"mr-fab-menu__icon\"]//*[@class=\" icon-svg\" and @data-spm-anchor-id]")));
          //  CreateCase.click();
        //}

}
