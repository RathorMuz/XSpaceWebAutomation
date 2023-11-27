package XSpace;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class XSpace_Setup extends XSpace_Wait{

    public XSpace_Setup(WebDriver driver) {
        XSpace_Wait.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //public static WebDriver driver;

    public WebDriver driver() throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver","/Users/muzammilqamar/Downloads/chromedriver-mac-arm64/chromedriver");
        String os = System.getProperty("os.name").toLowerCase();
        //WebDriverManager.chromedriver().setup();
        System.out.println("\n\nCurrent OS is: "+os+"\n\n");
        if(os.equalsIgnoreCase("mac os x")) {
            //WebDriverManager.chromedriver().setup();
            //ChromeDriverService service = ChromeDriverService.createDefaultService();
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--window-position=0,0", "--remote-allow-origins=*");
            //driver = new ChromeDriver(service, options);
            driver = new ChromeDriver(options);
        }
        else {

            Runtime.getRuntime().exec("sudo apt-get install xvfb");
            WebDriverManager.chromedriver().setup();
            ChromeDriverService service = ChromeDriverService.createDefaultService();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--headless");
            options.setBinary("/usr/bin/google-chrome");
            options.addArguments("disable-dev-shm-usage"); // recommended for running in Docker
            options.addArguments("no-sandbox"); // recommended for running in Docker
            options.addArguments("start-maximized"); // recommended for running in Docker
            options.addArguments("disable-gpu"); // recommended for running in Docker
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-component-update", "disable-default-apps", "disable-popup-blocking"));
            Runtime.getRuntime().exec("xvfb-run -a -s \"-screen 0 1920x1080x24\" google-chrome");
            driver = new ChromeDriver(service, options);

        }
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--window-position=0,0");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        ChromeDriver driver = new ChromeDriver(options);*/

        //driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://xspace.daraz.com/");
        XSpace_Wait.waitforelement().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='entry-link']")));
        driver.findElement(By.xpath("//*[@class='entry-link']")).click();
        driver.findElement(By.id("account")).sendKeys("muhammad.muzzamilq@alibaba-inc.com");
        driver.findElement(By.id("password")).sendKeys("Sum23muz26");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(10000);

        return driver;
    }


}
