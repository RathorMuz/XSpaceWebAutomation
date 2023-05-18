package XSpace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XSpace_Setup {

    public XSpace_Setup(WebDriver driver) {
        XSpace_Wait.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;

    public WebDriver driver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/muzammilqamar/Downloads/chromedriver_mac_arm64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://xspace.daraz.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='entry-link']")));
        driver.findElement(By.xpath("//*[@class='entry-link']")).click();
        driver.findElement(By.id("account")).sendKeys("muhammad.muzzamilq@alibaba-inc.com");
        driver.findElement(By.id("password")).sendKeys("Sum23muz26");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(10000);

        return driver;
    }


}
