package XSpace_Regression;

import XSpace.*;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import static XSpace.XSpace_Wait.driver;

public class MainSuite {

    XSpace_Setup t2 = new XSpace_Setup(driver);

    @BeforeTest
    public void XSpace_Setup() throws InterruptedException, IOException {
        driver = t2.driver();
    }

    @AfterTest
    public void Browser_close() {
        driver.close();
        driver.quit();
    }

    @AfterMethod
    public void TakeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") + "/Images/" + LocalTime.now() + ".jpg");
        FileUtils.copyFile(screenshot, dest);
        Allure.addAttachment("FailureTestCase", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Test(priority = 1, retryAnalyzer = Retry.class)
    public void clickCustomerCenterIcon() throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.clickCustomerCenterIcon(driver);
    }

    @Test(priority = 2, retryAnalyzer = Retry.class)
    public void BuyerSelection() throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.BuyerSelection(driver);
    }

    @Test(priority = 3)
    public void SelectBuyer() throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SelectBuyer(driver);
    }

    @Test(priority = 4)
    public void SearchByEmail() throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchByEmail(driver);
    }
    @Test(priority = 5)
    public void GetWalletInfo () throws InterruptedException {
      OpenCustomerCenter occ = new OpenCustomerCenter(driver);
    occ.WalletInfo(driver);
    }
    @Test(priority = 5)
    public void SearchbyPhoneNumber () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyPhoneNumber(driver);
    }
    @Test(priority = 6)
    public void SearchbyUserID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyUserID(driver);
    }
    @Test(priority = 7)
    public void SearchbyOrderID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyOrderID(driver);
    }
    @Test(priority = 8)
    public void SearchbyItemID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyItemID(driver);
    }
    @Test(priority = 9)
    public void SearchSOP () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchSOP(driver);
    }
    @Test(priority = 10)
    public void SearchVoucher () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchVoucher(driver);
    }
    @Test(priority = 11)
    public void clickCaseCenterIcon () throws InterruptedException {
        CaseCenter cc = new CaseCenter(driver);
        cc.clickCaseCenterIcon(driver);
    }
    @Test(priority = 12)
    public void C360DarazPluginData () {
        C360BuyerPlugin bp = new C360BuyerPlugin(driver);
        bp.C360DarazPluginData(driver);
    }
    @Test(priority = 13)
    public void CreateCase () throws InterruptedException {
        CaseCenter cs = new CaseCenter(driver);
        cs.CreateCase(driver);
    }
}

