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
    @FindBy(xpath = "//div[contains(text(),'Switch to Advanced Search')]//*[name()='svg']")
    public WebElement SearchExpand;
    @FindBy(xpath = "//div[contains(text(),'高级搜索')]//*[name()='svg']")
    public WebElement SearchExpand1;
    @FindBy(xpath = "//div[contains(text(),'Advanced Search')]//*[name()='svg']")
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
    @FindBy(css = "i.anticon.anticon-close.ant-select-remove-icon svg path")
    public WebElement CaseRemoveIcon;
    @FindBy(xpath = "//div[@role='tab']")
    public WebElement SearchedTab;
    @FindBy(xpath = "//li[text()='Chat']")
    public WebElement ChatOption;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.wrapper > div > div > div.data-view > div.search-area > div.search-form > div:nth-child(1) > div:nth-child(4) > div > div.item-content > span > span > span")
    public WebElement Category;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.wrapper > div > div > div.data-view > div.search-area > div.search-form > div:nth-child(1) > div:nth-child(4) > div > div.item-content > span > span > ul > li > span > input")
    public WebElement Categoryclick;
    @FindBy(css = "//span[@class='ant-select-tree-title' and text()='testing_apo']")
    public WebElement APOCategory;
    @FindBy(xpath = "li.ant-select-selection__choice span i.anticon svg")
    public WebElement CatRemoveicon;
    @FindBy(xpath = "//li[text()='DAR-CSC 2.0']")
    public WebElement CSCOption;
    @FindBy(css = "div:nth-child(11) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    public WebElement OrderID;
    @FindBy(xpath = "//div[@class='data-view']//div[9]//div[1]//div[2]//div[1]//div[1]//span[1]//i[1]//*[name()='svg']")
    public WebElement ParentOrChild;
    @FindBy(xpath = "//li[text()='Parent Case']")
    public WebElement Parent;
    @FindBy(xpath = "//li[text()='Child Case']")
    public WebElement Child;
    @FindBy(xpath = "//li[text()='Normal Case']")
    public WebElement Normal;
    @FindBy(xpath = "//*[@id=\"xspace-embedviewticket-search\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[3]")
    public WebElement SearchDataTable;

    //CaseCreationWebElements

    //@FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__entry > div.mr-fab__menus > div:nth-child(1) > div.mr-fab-menu__icon > svg > use")
    @FindBy(css = "div.mr-fab__menu.mr-fab__ball svg.icon-svg")
    public WebElement FabIcon;
    @FindBy(css = "div.mr-fab__menus div.mr-fab__menu:nth-child(1) div.mr-fab-menu__icon svg.icon-svg")
    public WebElement CreateCase;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__tabs > div > div > div > div > div.mr-fab-tab__content > div > div > div:nth-child(2) > div.component-content > div > div > div > span > i > svg")
    public WebElement Createcase_casetypeDD;
    @FindBy(xpath = "//li[text()='DAR-CSC 2.0']")
    public WebElement DarCSC;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__tabs > div > div > div > div > div.mr-fab-tab__content > div > div > div:nth-child(4) > div.component-content > div > div > div > div > div")
    public WebElement CaseChannel;
    @FindBy(xpath = "//li[text()='Web Form']")
    public WebElement WebForm;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__tabs > div > div > div > div > div.mr-fab-tab__content > div > div > div:nth-child(5) > div.component-content > div > div > div > div > div")
    public WebElement BuyerInput;
    @FindBy(css = "#xspace-embedviewticket-search > div > div > div.app-fab-draggable.app-fab > div > div.mr-fab__tabs > div > div > div > div > div.mr-fab-tab__content > div > div > div:nth-child(7) > div.component-content > div > span > span > span.ant-select-selection__rendered > span")
    public WebElement CategSelect;
    @FindBy(css = "#rc-tree-select-list_4 > span > span > input")
    public WebElement CategInput;
    @FindBy(css = "#root > div:nth-child(11) > div > div.ant-col.ant-col-18 > div.ant-form-item-control.xform-custom-widget.xform-custom-input > input")
    public WebElement OrderNumberInput;
    @FindBy(css = "#rc-tree-select-list_4 > ul > li > ul > li > ul > li > span.ant-select-tree-node-content-wrapper.ant-select-tree-node-content-wrapper-normal > span")
    public WebElement CatSelected;


    //Methods
    public void clickCaseCenterIcon(WebDriver driver) throws InterruptedException {
        XSpace_Wait.waitforelement().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#/system/ticket-search']")));
        CaseCenterIcon.click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-select-selection__placeholder']")));
        //Thread.sleep(3000);
        XSpace_Wait.waitforelement().until(ExpectedConditions.elementToBeClickable(By.cssSelector("div div.ant-select.ant-select-enabled.ant-select-allow-clear div.ant-select-selection.ant-select-selection--multiple div.ant-select-selection__rendered div.ant-select-selection__placeholder")));
        SearchCaseBar.click();
        Thread.sleep(1000);

        //Case1: Search with case number
        SearchCaseBar1.sendKeys("2500000108441061");
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        CaseRemoveIcon.click();
        Thread.sleep(1000);

        //Case2: Search with email
        SearchCaseBar1.sendKeys("mohammad.muzzamil@daraz.pk");
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        CaseRemoveIcon.click();
        Thread.sleep(3000);

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
        Thread.sleep(2000);
        SearchCaseBar1.sendKeys("2500000108441061");
        Thread.sleep(1000);
        SearchCaseBar1.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(1000);
        CaseRemoveIcon.click();

        //Expand Search with case type
        Thread.sleep(2000);
        CaseTypeDD.click();
        Thread.sleep(2000);
        RefundOnlyOption.click();
        Thread.sleep(2000);
        SearchButton.click();
        //String expected = SearchedTab.getText();
        //String actual = RefundOnlyOption.getText();
        //Assert.assertEquals(actual,expected);
        Thread.sleep(1000);
        CaseTypeDD.click();
        Thread.sleep(2000);

        //Expand search with case channel
        ChannelDD.click();
        Thread.sleep(2000);
        ChatOption.click();
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(1000);
        ChannelDD.click();
        Thread.sleep(1000);

        //Expand search with category
        Category.click();
        Categoryclick.sendKeys("testing_apo");
        Thread.sleep(1000);
        APOCategory.click();
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(2000);
        CaseRemoveIcon.click();

        //Expand search with CSC2.0-OrderID
        CaseTypeDD.click();
        Thread.sleep(1000);
        CSCOption.click();
        Thread.sleep(1000);
        OrderID.click();
        OrderID.sendKeys("160465618566881");
        SearchButton.click();
        Thread.sleep(1000);
        ParentOrChild.click();
        Thread.sleep(1000);
        Normal.click();
        Thread.sleep(1000);
        ParentOrChild.click();
        ParentOrChild.click();
        Thread.sleep(1000);
        Parent.click();
        Thread.sleep(1000);
        SearchButton.click();

        boolean SearchTable = SearchDataTable.isDisplayed();
        Assert.assertTrue(SearchTable);

    }
        public void CreateCase(WebDriver driver) throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(FabIcon).perform();
            CreateCase.click();
            action.moveToElement(FabIcon).moveToElement(CreateCase).click().build().perform();
            Thread.sleep(1000);
            Createcase_casetypeDD.click();
            Thread.sleep(1000);
            DarCSC.click();
            Thread.sleep(1000);
            CaseChannel.click();
            Thread.sleep(1000);
            WebForm.click();
            Thread.sleep(1000);
            BuyerInput.click();
            BuyerInput.sendKeys("mohammad.muzzamil@daraz.pk");
            BuyerInput.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            CategSelect.click();
            Thread.sleep(1000);
            CategInput.sendKeys("testing_apo");
            CatSelected.click();
            Thread.sleep(1000);
            OrderNumberInput.sendKeys("160465618566881");


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
