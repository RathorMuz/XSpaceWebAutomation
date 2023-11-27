package XSpace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceTools {
    public ServiceTools(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //WebElements
    @FindBy(xpath = "//div[text()='Order List']")
    public WebElement OrderList;

    @FindBy(xpath = "//div[text()='Contact History']")
    public WebElement ContactHistory;

    @FindBy(xpath = "//div[text()='Case History']")
    public WebElement CaseHistory;

    @FindBy(css = "div.search-content span.ant-input-search.ant-input-affix-wrapper input")
    public WebElement SearchBarOrderID;

    @FindBy(css = "span.ant-calendar-range-picker-separator")
    public WebElement CalendarSelector;

    @FindBy(css = "td[title='November 11th 2023'] div.ant-calendar-date")
    public WebElement StartDate;

    @FindBy(css = "td[title='November 15th 2023'] div.ant-calendar-date")
    public WebElement EndDate;

    @FindBy(css = "div.ant-calendar-footer-btn a.ant-calendar-ok-btn")
    public WebElement CalendarOKBtn;




}
