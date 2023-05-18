package XSpace_Regression;

import XSpace.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static XSpace.XSpace_Wait.driver;

public class MainSuite {

    XSpace_Setup t2 = new XSpace_Setup(driver);

    @BeforeTest
    public void XSpace_Setup() throws InterruptedException
    {
        driver = t2.driver();
    }

    @Test(priority = 1, enabled = false)
    public void clickCustomerCenterIcon () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.clickCustomerCenterIcon(driver);

    }
    @Test(priority = 2, enabled = false)
    public void BuyerSelection () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.BuyerSelection(driver);
    }
    @Test(priority = 3, enabled = false)
    public void SelectBuyer () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SelectBuyer(driver);
    }
    @Test(priority = 4, enabled = false)
    public void SearchByEmail () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchByEmail(driver);
    }
    @Test(priority = 5, enabled = false)
    public void SearchbyPhoneNumber () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyPhoneNumber(driver);
    }
    @Test(priority = 6, enabled = false)
    public void SearchbyUserID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyUserID(driver);
    }
    @Test(priority = 7, enabled = false)
    public void SearchbyOrderID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyOrderID(driver);
    }
    @Test(priority = 8, enabled = false)
    public void SearchbyItemID () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchbyItemID(driver);
    }
    @Test(priority = 9, enabled = false)
    public void SearchSOP () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchSOP(driver);
    }
    @Test(priority = 10, enabled = false)
    public void SearchVoucher () throws InterruptedException {
        OpenCustomerCenter occ = new OpenCustomerCenter(driver);
        occ.SearchVoucher(driver);
    }
    @Test(priority = 11)
    public void clickCaseCenterIcon () throws InterruptedException {
        CaseCenter cc = new CaseCenter(driver);
        cc.clickCaseCenterIcon(driver);
    }
    @Test(priority = 12, enabled = false)
    public void C360DarazPluginData () {
        C360BuyerPlugin bp = new C360BuyerPlugin(driver);
        bp.C360DarazPluginData(driver);
    }



}
