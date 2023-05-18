package XSpace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XSpace_Wait {

    public static WebDriver driver;
    //public static WebDriverWait wait =null;
    public static WebDriverWait waitforelement()
    {
        return new WebDriverWait(driver, 30);
    }
}
