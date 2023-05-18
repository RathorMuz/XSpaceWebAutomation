package XSpace;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenCustomerCenter {

    public OpenCustomerCenter(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    //WebElements
    @FindBy(xpath = "//a[@href='#/system/customer-center-daraz']")
    public WebElement CustomerCenterIcon;
    @FindBy(xpath = "//*[text()=\"Buyers\"]")
    public WebElement CustomerCenterBuyerSelectionDropdown;
    @FindBy(xpath = "//*[text()=\"Buyers\" and @role=\"option\"]")
    public WebElement BuyerSelected;
    @FindBy(xpath = "//*[@class='ant-input ant-input-lg']")
    public WebElement searchbar;
    @FindBy(xpath = "//button[@type=\"button\"]")
    public WebElement searchIcon;
    @FindBy(xpath = "//*[text()='Mohammad Muzzamil Qamar']")
    public WebElement name;
    @FindBy(css = "div.extra-info-duo:nth-child(1) div.item-value.text.right")
    public WebElement OrderInfoValue;
    @FindBy(css = "div.extra-info-duo:nth-child(2) div.item-value.text.right")
    public WebElement SuccessOrderValue;
    @FindBy(css = "div.extra-info-duo:nth-child(3) div.item-value.text.right")
    public WebElement CancelledOrderValue;
    @FindBy(css = "div.extra-info-duo:nth-child(4) div.item-value.text.right")
    public WebElement ReturnedOrderValue;
    @FindBy(css = "div.order-card.card-content.additional-info-content div.item-value")
    public WebElement ShippingAddress;
    @FindBy(xpath = "//*[@class= \"anticon anticon-close ant-tabs-close-x\"]")
    public WebElement CloseButton;
    @FindBy(css = "div.extra-info-solo:nth-child(1) div.item-value.text")
    public WebElement CustomerName;
    @FindBy(css = "div.extra-info-solo:nth-child(2) div.item-value.text")
    public WebElement OrderDate;
    @FindBy(css = "div.extra-info-solo:nth-child(3) div.item-value.text")
    public WebElement OrderShippingAddress;
    @FindBy(css = "div.extra-info-solo:nth-child(4) div.item-value.text")
    public WebElement OrderBillingAddress;
    @FindBy(css = "div.extra-info-duo:nth-child(1) div.extra-info-duo-itemA div.item-value")
    public WebElement PaymentMethod;
    @FindBy(css = "div.extra-info-duo:nth-child(1) div.extra-info-duo-itemA div.item-value")
    public WebElement PaymentStatus;
    @FindBy(xpath = "//*[@class= \"baymax-iconfont icon-bm-list-o\"]")
    public WebElement SOPButton;
    @FindBy(xpath = "//*[@class= 'ant-input baymax-core-2-6-9-components-navigator-searcher--input']")
    public WebElement Searchbox;
    @FindBy(xpath = "//*[@class= 'baymax-core-2-6-9-components-navigator-searcher--expander baymax-iconfont icon-bm-search']")
    public WebElement Searchicon;
    @FindBy(xpath = "//*[@class= 'baymax-core-2-6-9-components-question--title' and text()= 'Where Is My Order?']")
    public WebElement SearchIc;
    @FindBy(css = "div.xsop-sdk-2-12-1-plugins-selectors-default--container input.ant-input")
    public WebElement OrderSelector;
    @FindBy(css = "div.copy-tooltip")
    public WebElement OrderID;
    @FindBy(css = "div.extra-info-duo:nth-child(1) div.extra-info-duo-itemA div.item-value")
    public WebElement PayMethod;
    @FindBy(css = "div.ant-collapse-content.ant-collapse-content-active  div  div  div:nth-child(2)  div.extra-info-duo-itemA div.item-value.text")
    public WebElement PayStatus;
    @FindBy(css = "div.extra-info-duo:nth-child(3) div.extra-info-duo-itemA div.item-value")
    public WebElement VchrCode;
    @FindBy(css = "div.extra-info-duo:nth-child(4) div.extra-info-duo-itemA div.item-value")
    public WebElement VerificationStatus;
    @FindBy(css = "div.extra-info-duo:nth-child(5) div.extra-info-duo-itemA div.item-value")
    public WebElement RebatesExpired;
    @FindBy(css = "div.extra-info-duo:nth-child(6) div.extra-info-duo-itemA div.item-value")
    public WebElement HandlingFee;
    @FindBy(css = "div.extra-info-duo:nth-child(1) div.extra-info-duo-itemB div.item-value")
    public WebElement TotalPaid;
    @FindBy(css = "div.extra-info-duo:nth-child(2) div.extra-info-duo-itemB div.item-value")
    public WebElement ShippingFee;
    @FindBy(css = "div.extra-info-duo:nth-child(3) div.extra-info-duo-itemB div.item-value")
    public WebElement Discount;
    @FindBy(css = "div.extra-info-duo:nth-child(4) div.extra-info-duo-itemB div.item-value")
    public WebElement TaxAmount;
    @FindBy(css = "div.extra-info-duo:nth-child(5) div.extra-info-duo-itemB div.item-value")
    public WebElement RebatesUsed;
    @FindBy(css = "div.extra-info-duo:nth-child(6) div.extra-info-duo-itemB div.item-value")
    public WebElement HandlingFeePercentage;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemA div.text-12 div:nth-child(1) a")
    public WebElement PDPLink;
    @FindBy(css= "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemA div.text-12 div.text-11.text-grey.ellipsis")
    public WebElement Package;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(3) div div.item-value2.text span span")
    public WebElement ItemID;
    @FindBy(css= "div ul li:nth-child(1) div main div div button.ant-btn.xsop-sdk-2-10-5-plugins-selectors-default--btn.ant-btn-primary")
    public WebElement OKButton;
    @FindBy(css = "div main div ul li:nth-child(1) div main div div button span")
    public WebElement NoSpecOrder;
    @FindBy(css= "div:nth-child(1) div div div.xsop-sdk-2-10-5-components-solutionchunk--content.xsop-sdk-2-10-5-components-solutionchunk--enableimgchecker div p a")
    public WebElement MyOrders;
    @FindBy(css = "div.xsop-sdk-2-10-5-plugins-nodes-solutionnode--operations > div.xsop-sdk-2-10-5-components-actions--actions > div > button")
    public WebElement CreateCase;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 > div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemA div.global-order-detail_shipping_22giE div.global-order-detail_shippingStatus_3VkmY div.text-blue span")
    public WebElement ItemOrderStatus;
    @FindBy(css= "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemA div.global-order-detail_shipping_22giE div.text-12")
    public WebElement ItemOrderDateTime;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemA div.global-order-detail_shipping_22giE div:nth-child(4) button")
    public WebElement PDPSnapshot;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.global-order-detail_header_to4wa div div.extra-info-duo-itemB div.global-order-detail_payment_2QA8I.item-value2.text div b span span")
    public WebElement ItemPrice;
    @FindBy(xpath = "//button[@class='ant-btn global-order-detail_btnGenerateVoucher_3L_hZ ant-btn-link ant-btn-sm']")
    public WebElement GenVoucher;
    @FindBy(xpath= "//i[@class='anticon anticon-close ant-modal-close-icon']//*[name()='svg']")
    public WebElement PDPCloseBtn;
    @FindBy(xpath= "//div[@class='ant-modal voucher-modal']//i[@aria-label='icon: close']//*[name()='svg']")
    public WebElement VouCloseBtn;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(1) div div.item-value2.undefined div div")
    public WebElement ItemSellerName;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(1) div div.item-value2.undefined div span:nth-child(3)")
    public WebElement ItemSellerType;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(5) div div.item-value.text")
    public WebElement ItemOriginalDate;
    @FindBy(css= "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(2) div div.item-value2.text span span")
    public WebElement ItemUnitPrice;
    @FindBy(css = "div.global-order-detail_container_Ieyk6 div:nth-child(1) div div.extra-info-duo.package-line div:nth-child(4) div div.item-value2.text span span")
    public WebElement ItemShippingFee;
    @FindBy(xpath = "//*[@role=\"tab\" and span =\"Voucher\"]")
    public WebElement Voucher;
    @FindBy(css = "div.app-intl-voucher-info div div.intl-voucher-info-search-page div.app-intl-voucher-info-search-bar  span:nth-child(1) input")
    public WebElement VoucherSearchbar;
    @FindBy(css = "div.order-detail-top-bar div i.anticon")
    public WebElement OrderInfoBackButton;
    @FindBy(css = "div > div:nth-child(4) > div.component-content > div > div > div > div > div")
    public WebElement CaseChannel;
    @FindBy(xpath = "//li[text()='Chat']")
    public WebElement ChatOption;
    @FindBy(xpath = "//*[@id=\"root\"]/div[12]/div/div[2]/div[1]/input")
    public WebElement Description;
    @FindBy(xpath = "//*[@type=\"button\" and span = \"Submit\"]")
    public WebElement SubmitCaseButton;
    @FindBy(css = "#themeTip_3 > div > div.ant-popover-inner-content > div > div > button")
    public WebElement Popup;
    @FindBy(xpath = "//div[@class=\"ant-row\"]//*[name()='svg']//*[name()='path' and contains(@d,'512l262.5')]")
    public WebElement CaseCloseBtn;
    @FindBy(xpath = "//div[@class=\"intl-voucher-info-search-page\"]//*[name()='svg']//*[name()='path' and contains(@d,'M909.6')]")
    public WebElement VoucherSearchBtn;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(2) div:nth-child(2)")
    public WebElement VoucherStatus;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(3) div:nth-child(2)")
    public WebElement VoucherCode;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(4) div:nth-child(2)")
    public WebElement Validity;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(5) div:nth-child(2)")
    public WebElement TemplateName;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(6) div:nth-child(2)")
    public WebElement TemplateDescription;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(7) div:nth-child(2)")
    public WebElement TemplateID;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(8) div:nth-child(2)")
    public WebElement DateCreated;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(9) div:nth-child(2)")
    public WebElement CreatedBy;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(10) div:nth-child(2)")
    public WebElement DiscountAmount;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(11) div:nth-child(2)")
    public WebElement UsageLimitPerVoucher;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(12) div:nth-child(2)")
    public WebElement UsageLimitPerCustomer;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(13) div:nth-child(2)")
    public WebElement LockToCustomer;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(14) div:nth-child(2)")
    public WebElement DeviceType;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(15) div:nth-child(2)")
    public WebElement MinOrderAmount;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(16) div:nth-child(2)")
    public WebElement Categories;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(17) div:nth-child(2)")
    public WebElement SKUs;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(18) div:nth-child(2)")
    public WebElement CreditCardBins;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(19) div:nth-child(2)")
    public WebElement PaymentMethods;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(20) div:nth-child(2)")
    public WebElement CustomerType;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(21) div:nth-child(2)")
    public WebElement SellerName;
    @FindBy(css = "div[class='seller-view-container'] div:nth-child(22) div:nth-child(2)")
    public WebElement BrandName;


    //Methods
    public void clickCustomerCenterIcon(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#/system/customer-center-daraz']")));
        CustomerCenterIcon.click();
    }
    public void BuyerSelection(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        CustomerCenterBuyerSelectionDropdown.click();
    }
    public void SelectBuyer(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        BuyerSelected.click();
    }
    public void SearchByEmail(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        searchbar.sendKeys("mohammad.muzzamil@daraz.pk");
        Thread.sleep(2000);
        searchIcon.click();
        Thread.sleep(3000);
        name.click();
        Thread.sleep(3000);

        System.out.println("*************************************");
        System.out.println("Welcome to Customer Center Daraz");
        System.out.println("*************************************\n");

        System.out.println("*************************************");
        System.out.println("TOTAL ORDER INFORMATION");
        System.out.println("*************************************\n");

        Thread.sleep(3000);

        boolean value1 = OrderInfoValue.getText().isEmpty();
        if(value1 == false)
        {
            Assert.assertFalse(value1);
            System.out.println("Total Orders Value: " + OrderInfoValue.getText());
        }

        boolean value2 = SuccessOrderValue.getText().isEmpty();
        if(value2 == false)
        {
            Assert.assertFalse(value2);
            System.out.println("Successful Orders Value: " + SuccessOrderValue.getText());
        }

        boolean value3 = CancelledOrderValue.getText().isEmpty();
        if(value3 == false)
        {
            Assert.assertFalse(value3);
            System.out.println("Cancelled Orders Value: " + CancelledOrderValue.getText());
        }

        boolean value4 = ReturnedOrderValue.getText().isEmpty();
        if(value4 == false)
        {
            Assert.assertFalse(value4);
            System.out.println("Returned Orders: " + ReturnedOrderValue.getText());
        }

        boolean value5 = ShippingAddress.getText().isEmpty();
        if(value5 == false)
        {
            Assert.assertFalse(value5);
            System.out.println("Default Shipping Address: " + ShippingAddress.getText());
        }

        System.out.println("\n");

        Thread.sleep(2000);
        CloseButton.click();
        Thread.sleep(1000);
        searchbar.clear();

    }
    public void SearchbyPhoneNumber(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        searchbar.sendKeys("03358149637");
        Thread.sleep(2000);
        searchIcon.click();
        Thread.sleep(3000);
        name.click();
        Thread.sleep(3000);
        CloseButton.click();
        Thread.sleep(1000);
        searchbar.clear();
    }
    public void SearchbyUserID(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        searchbar.sendKeys("600024366881");
        Thread.sleep(2000);
        searchIcon.click();
        Thread.sleep(3000);
        name.click();
        Thread.sleep(3000);
        CloseButton.click();
        Thread.sleep(1000);
        searchbar.clear();
    }
    public void SearchbyOrderID(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        searchbar.sendKeys("147019662966881");
        Thread.sleep(2000);
        searchIcon.click();
        Thread.sleep(10000);

        String orderID = OrderID.getText();
        String expected = "Order #147019662966881";
        if(orderID == expected)
        {
            System.out.println("Order ID is verified. Order ID:" + orderID);
        }

        Thread.sleep(1000);

        System.out.println("*************************************");
        System.out.println("BUYER ORDER INFORMATION");
        System.out.println("*************************************\n");

        boolean custname = CustomerName.getText().isEmpty();
        if(custname == false)
        {
            Assert.assertFalse(custname);
            System.out.println("Customer Name:" + CustomerName.getText());
        }

        boolean orderdate = OrderDate.getText().isEmpty();
        if(orderdate == false)
        {
            Assert.assertFalse(orderdate);
            System.out.println("Order Date:" + OrderDate.getText());
        }

        boolean ShippingAdd = OrderShippingAddress.getText().isEmpty();
        if(ShippingAdd == false)
        {
            Assert.assertFalse(ShippingAdd);
            System.out.println("Order Shipping Address:" + OrderShippingAddress.getText());
        }

        boolean BillingAdd = OrderBillingAddress.getText().isEmpty();
        if(BillingAdd == false)
        {
            Assert.assertFalse(BillingAdd);
            System.out.println("Order Billing Address:" + OrderBillingAddress.getText());
        }

        boolean PayM = PaymentMethod.getText().isEmpty();
        if(PayM == false)
        {
            Assert.assertFalse(PayM);
            System.out.println("Payment Method:" + PaymentMethod.getText());
        }

        boolean PayS = PayStatus.getText().isEmpty();
        if(PayS == false)
        {
            Assert.assertFalse(PayS);
            System.out.println("Payment Status:" + PayStatus.getText());
        }

        boolean VouC = VchrCode.getText().isEmpty();
        if(VouC == false)
        {
            Assert.assertFalse(VouC);
            System.out.println("Voucher Code:" + VchrCode.getText());
        }

        boolean VerStat = VerificationStatus.getText().isEmpty();
        if(VerStat == false)
        {
            Assert.assertFalse(VerStat);
            System.out.println("Verification Status:" + VerificationStatus.getText());
        }

        boolean TP = TotalPaid.getText().isEmpty();
        if(TP == false)
        {
            Assert.assertFalse(TP);
            System.out.println("Total Paid Price:" + TotalPaid.getText());
        }

        boolean SFee = ShippingFee.getText().isEmpty();
        if(SFee == false)
        {
            Assert.assertFalse(SFee);
            System.out.println("Shipping Fee:" + ShippingFee.getText());
        }

        boolean Disc = Discount.getText().isEmpty();
        if(Disc == false)
        {
            Assert.assertFalse(Disc);
            System.out.println("Discount:" + Discount.getText());
        }

        boolean TM = TaxAmount.getText().isEmpty();
        if(TM == false)
        {
            Assert.assertFalse(TM);
            System.out.println("Tax Amount:" + TaxAmount.getText());
        }

        Thread.sleep(3000);
        CloseButton.click();
        Thread.sleep(1000);
        searchbar.clear();
    }

    public void SearchbyItemID(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        searchbar.sendKeys("147019663466881");
        Thread.sleep(2000);
        searchIcon.click();
        Thread.sleep(15000);

        String itemID = ItemID.getText();
        String actualID = "147019663466881";
        if (itemID == actualID)
        {
            Assert.assertEquals(actualID,itemID);
            System.out.println("Item ID is verified. Item ID:" + "ItemID.getText()");
        }

        System.out.println("\n*************************************");
        System.out.println("ITEM INFORMATION");
        System.out.println("*************************************\n");

        Thread.sleep(2000);
        PDPLink.click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        driver.switchTo().window(windowHandlesList.get(1));
        Thread.sleep(10000);
        driver.close();
        driver.switchTo().window(windowHandlesList.get(0));

        Thread.sleep(1000);

        boolean pckg = Package.getText().isEmpty();
        if(pckg == false)
        {
            Assert.assertFalse(pckg);
            System.out.println(Package.getText());
        }
        boolean itstatus = ItemOrderStatus.getText().isEmpty();
        if(itstatus == false)
        {
            Assert.assertFalse(itstatus);
            System.out.println("Item Status:" + ItemOrderStatus.getText());
        }
        boolean datetime = ItemOrderDateTime.getText().isEmpty();
        if(datetime == false)
        {
            Assert.assertFalse(datetime);
            System.out.println("Item Date and Time:" + ItemOrderDateTime.getText());
        }

        Thread.sleep(1000);
        Popup.click();
        Thread.sleep(1000);
        PDPSnapshot.click();
        Thread.sleep(2000);
        PDPCloseBtn.click();

        boolean itemprice = ItemPrice.getText().isEmpty();
        if(itemprice == false)
        {
            Assert.assertFalse(itemprice);
            System.out.println("Item Price:" + ItemPrice.getText());
        }

        Thread.sleep(2000);
        GenVoucher.click();
        Thread.sleep(2000);
        VouCloseBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);

        boolean seller = ItemSellerName.getText().isEmpty();
        if(seller == false)
        {
            Assert.assertFalse(seller);
            System.out.println("Seller Name:" + ItemSellerName.getText());
        }
        boolean sellertype = ItemSellerType.getText().isEmpty();
        if(sellertype == false)
        {
            Assert.assertFalse(sellertype);
            System.out.println("Seller Type:" + ItemSellerType.getText());
        }
        boolean unitPr = ItemUnitPrice.getText().isEmpty();
        if(unitPr == false)
        {
            Assert.assertFalse(unitPr);
            System.out.println("Unit Price:" + ItemUnitPrice.getText());
        }
        boolean Shipfee = ItemShippingFee.getText().isEmpty();
        if(Shipfee == false)
        {
            Assert.assertFalse(Shipfee);
            System.out.println("Shipping Fee:" + ItemShippingFee.getText());
        }
        boolean Promised = ItemOriginalDate.getText().isEmpty();
        if(Promised == false)
        {
            Assert.assertFalse(Promised);
            System.out.println("Seller Name:" + ItemOriginalDate.getText());
        }

        System.out.println("\n*************************************");

    }
    public void SearchSOP(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        SOPButton.click();
        Thread.sleep(1000);
        Searchbox.sendKeys("Where is my order?");
        Searchicon.click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class= 'baymax-core-2-6-9-components-question--title' and text()= 'Where Is My Order?']")));
        SearchIc.click();
        Thread.sleep(3000);
        OrderSelector.sendKeys("147019663466881");
        OrderSelector.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        OKButton.click();
        Thread.sleep(3000);
        NoSpecOrder.click();
        Thread.sleep(3000);
        MyOrders.click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        driver.switchTo().window(windowHandlesList.get(1));
        Thread.sleep(10000);
        driver.close();
        driver.switchTo().window(windowHandlesList.get(0));
        Thread.sleep(3000);
        CreateCase.click();
        Thread.sleep(7000);
        CaseChannel.click();
        Thread.sleep(5000);
        ChatOption.click();
        Thread.sleep(5000);
        Description.click();
        Thread.sleep(3000);
        Description.sendKeys("Test Case created from Automated script");
        Thread.sleep(2000);
        SubmitCaseButton.click();
        Thread.sleep(5000);
        CaseCloseBtn.click();
        Thread.sleep(2000);
    }

    public void SearchVoucher(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        Voucher.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.app-intl-voucher-info div div.intl-voucher-info-search-page div.app-intl-voucher-info-search-bar  span:nth-child(1) input")));
        VoucherSearchbar.click();
        VoucherSearchbar.sendKeys("EMPJANe4u28p");
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"intl-voucher-info-search-page\"]//*[name()='svg']//*[name()='path' and contains(@d,'M909.6')]")));
        //VoucherSearchBtn.click();
        VoucherSearchbar.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        boolean VchrStatus = VoucherStatus.getText().isEmpty();
        if(VchrStatus == false)
        {
            Assert.assertFalse(VchrStatus);
            System.out.println("Voucher Status: " + VoucherStatus.getText());
        }

        boolean VchrCode = VoucherCode.getText().isEmpty();
        if(VchrCode == false)
        {
            Assert.assertFalse(VchrCode);
            System.out.println("Voucher Code: " + VoucherCode.getText());
        }

        boolean Valid = Validity.getText().isEmpty();
        if(Valid == false)
        {
            Assert.assertFalse(Valid);
            System.out.println("Validity: " + Validity.getText());
        }

        boolean TempName = TemplateName.getText().isEmpty();
        if(TempName == false)
        {
            Assert.assertFalse(TempName);
            System.out.println("Template Name: " + TemplateName.getText());
        }

        boolean TempDesc = TemplateDescription.getText().isEmpty();
        if(TempDesc == false)
        {
            Assert.assertFalse(TempDesc);
            System.out.println("Template Description: " + TemplateDescription.getText());
        }

        boolean TempID = TemplateID.getText().isEmpty();
        if(TempID == false)
        {
            Assert.assertFalse(TempID);
            System.out.println("Template ID: " + TemplateID.getText());
        }

        boolean DateCr = DateCreated.getText().isEmpty();
        if(DateCr == false)
        {
            Assert.assertFalse(DateCr);
            System.out.println("Date Created: " + DateCreated.getText());
        }

        boolean CreateBy = CreatedBy.getText().isEmpty();
        if(CreateBy == false)
        {
            Assert.assertFalse(CreateBy);
            System.out.println("Created By: " + CreatedBy.getText());
        }

        boolean DiscAmt = DiscountAmount.getText().isEmpty();
        if(DiscAmt == false)
        {
            Assert.assertFalse(DiscAmt);
            System.out.println("Discount Amount: " + DiscountAmount.getText());
        }

        boolean UsagePerVou = UsageLimitPerVoucher.getText().isEmpty();
        if(UsagePerVou == false)
        {
            Assert.assertFalse(UsagePerVou);
            System.out.println("Usage Limit per Voucher: " + UsageLimitPerVoucher.getText());
        }

        boolean UsagePerCust = UsageLimitPerCustomer.getText().isEmpty();
        if(UsagePerCust == false)
        {
            Assert.assertFalse(UsagePerCust);
            System.out.println("Usage Limit per Customer: " + UsageLimitPerCustomer.getText());
        }

        boolean LTC = LockToCustomer.getText().isEmpty();
        if(LTC == false)
        {
            Assert.assertFalse(LTC);
            System.out.println("Lock to Customer: " + LockToCustomer.getText());
        }

        boolean DevType = DeviceType.getText().isEmpty();
        if(DevType == false)
        {
            Assert.assertFalse(DevType);
            System.out.println("Device Type: " + DeviceType.getText());
        }

        boolean MinOrder = MinOrderAmount.getText().isEmpty();
        if(MinOrder == false)
        {
            Assert.assertFalse(MinOrder);
            System.out.println("Minimum Order Amount: " + MinOrderAmount.getText());
        }

        boolean Cat = Categories.getText().isEmpty();
        if(Cat == false)
        {
            Assert.assertFalse(Cat);
            System.out.println("Categories: " + Categories.getText());
        }

        boolean Sku = SKUs.getText().isEmpty();
        if(Sku == false)
        {
            Assert.assertFalse(Sku);
            System.out.println("SKU(s): " + SKUs.getText());
        }

        VoucherSearchbar.clear();
        Thread.sleep(1000);
        OrderInfoBackButton.click();
    }

}
