package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderGiroPay extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("OpenBrowser |GiroPay")
    public void openbrowser_GiroPay() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open page Brink DEV |GiroPay")
    public void open_page_Brink_DEV_GiroPay() {
        driver.get(URL);
        System.out.println("Открыта страница ДЕВ");
    }

    @Given("Enter User |GiroPay")
    public void enter_User_GiroPay() {
        System.out.println("Введен Юзер");
    }

    @Given("Enter Pass |GiroPay")
    public void enter_Pass_GiroPay() {
        System.out.println("Введен пароль");

    }

    @Given("Click botton OK |GiroPay")
    public void click_botton_OK_GiroPay() throws InterruptedException {
        System.out.println("Нажата кнопка ОК");
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/eg-geolocation-modal/div/div/button[1]")).click();
        System.out.println("Нажата кнопка JA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/eg-form-select-city-modal/eg-load-container/div/div[3]/button[2]")).click();
        System.out.println("Нажата кнопка NICHT MEHR ERINNERN ");
        String loginString = driver.findElement(By.xpath("/html/body/eg-root/eg-home-page/div/div[1]/div/div[1]/eg-get-delivery/div/h1")).getText();
        assertTrue(loginString.contains("Lass es dir schnell liefern"));
        System.out.println("Открыта главная страница");
    }

    @When("Click botton Profile |GiroPay")
    public void click_botton_Profile_GiroPay() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div")).click();
        System.out.println("Открыт попап - профиль");
        Thread.sleep(1000);
    }

    @When("Enter Benutzername \\(E-Mail) |GiroPay")
    public void enter_Benutzername_E_Mail_GiroPay() {
        driver.findElement(By.id("auth_modal_email")).sendKeys(USER_admin);
        System.out.println("Введена почта qq@qq.qq");
    }

    @When("Enter Passwort |GiroPay")
    public void enter_Passwort_GiroPay() {
        driver.findElement(By.id("auth_modal_password")).sendKeys(PASSWORD_admin);
        System.out.println("Введен 12345678");
    }

    @When("Click botton Anmelden und weiter |GiroPay")
    public void click_botton_Anmelden_und_weiter_GiroPay() throws InterruptedException {
        driver.findElement(By.xpath("//eg-auth-modal/eg-modal/div[2]/eg-auth-form/div/form/div[3]/button")).click();
        System.out.println("Нажата кнопка авторизации");
        Thread.sleep(1500);
    }

    @When("Click botton Quick finder|GiroPay")
    public void click_botton_Quick_finder_GiroPay() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/div[1]/div/div/div[6]/div/div[1]/eg-lang-switcher/div/span[1]")).click();
        System.out.println("Сменен язык на EN");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/div[1]/div/div/div[3]/div/h4")).click();
        Thread.sleep(2000);
        System.out.println("Открыта вкладка Quick finder");
    }

    @When("Select category American Diner im Cinecitta|GiroPay")
    public void select_category_American_Diner_im_Cinecitta_GiroPay() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/eg-root/eg-vendors-page/div/div[3]/eg-vendor-list/div/div[1]/eg-vendor-ticket/div/div/div[2]/a")));
        driver.findElement(By.xpath("/html/body/eg-root/eg-vendors-page/div/div[3]/eg-vendor-list/div/div[1]/eg-vendor-ticket/div/div/div[2]/a")).click();
        System.out.println("Открыта вкладка American Diner im Cinecitta ");
        Thread.sleep(2000);
    }

    @When("Choose the quantity of the product \" Arizona Iced Tea Blueberry“ in the size of {int} pcs|GiroPay")
    public void choose_the_quantity_of_the_product_Arizona_Iced_Tea_Blueberry_in_the_size_of_pcs_GiroPay(Integer int1) {
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        System.out.println("Выбрано 5 товаров ");
    }

    @When("Add an item to the cart|GiroPay")
    public void add_an_item_to_the_cart_GiroPay() {
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/div")).click();
        String CartString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[1]/div/mat-icon/div")).getText();
        assertTrue(CartString.contains("5"));
        System.out.println("Уточнено что выбрано 5 товаров - Нажата кнопка - добавить в корзину ");
    }

    @When("Click botton cart|GiroPay")
    public void click_botton_cart_GiroPay() {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]")).click();
        System.out.println("Нажата кнопка - Корзина ");
    }

    @When("Click botton checkout|GiroPay")
    public void click_botton_checkout_GiroPay() {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/button")).click();
        System.out.println("Нажата кнопка Checkout");
    }

    @When("Click Continue|GiroPay")
    public void click_Continue_GiroPay() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement contbottom = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button"));
        actions.moveToElement(contbottom).perform();
        contbottom.click();
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button")));
        System.out.println("Нажата кнопка Continue");
        Thread.sleep(4000);
    }

    @When("Select type GiroPay|GiroPay")
    public void select_type_GiroPay_GiroPay() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement radioSofort = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[2]/eg-checkout-payment/eg-load-container/div/form/div[1]/eg-checkout-payment-method[5]"));
        actions.moveToElement(radioSofort).perform();
        radioSofort.click();
        Thread.sleep(3000);

    }

    @When("Check the box on \"I hereby accept Egourmery's Terms and conditions and Privacy policy“|GiroPay")
    public void check_the_box_on_I_hereby_accept_Egourmery_s_Terms_and_conditions_and_Privacy_policy_GiroPay() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkout_payment_privacy\"]/div/mat-icon"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox).perform();
        checkbox.click();
        Thread.sleep(1500);
        System.out.println("Выбран чекбокс Terms and conditions and Privacy policy");
    }

    @When("Enter your name QAA|GiroPay")
    public void enter_your_name_QAA_GiroPay() {
        driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[2]/eg-checkout-payment/eg-load-container/div/form/div[3]/eg-payment-giropay-form/eg-payment-details-form/form/div[2]/div/div[1]/div[2]/div/input"))
                .sendKeys("QAA");
    }

    @When("Enter your email qa@qa.qa|GiroPay")
    public void enter_your_email_qa_qa_qa_GiroPay() {
        driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[2]/eg-checkout-payment/eg-load-container/div/form/div[3]/eg-payment-giropay-form/eg-payment-details-form/form/div[2]/div/div[2]/div[2]/div/input"))
                .sendKeys(USER_admin);
        driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button[2]")).click();
        System.out.println("Переход на страйп");

    }

    @When("Open Page stripe|GiroPay")
    public void open_Page_stripe_GiroPay() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/header/h1")));
        String TestStripePage = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/header/h1")).getText();
        assertTrue(TestStripePage.contains("giropay test payment page"));
        System.out.println("Откроется страница stripe для тестовой оплаты");
    }

    @When("Click botton Authorize test payment|GiroPay")
    public void click_botton_Authorize_test_payment_GiroPay() {
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[2]/form/button[1]")).click();
        System.out.println("Нажата кнопка Authorize test payment ");
    }

    @Then("Order complete, browser closed|GiroPay")
    public void order_complete_browser_closed_GiroPay() throws InterruptedException {
        Thread.sleep(1500);
        String OrderDone = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/eg-checkout-payment-result/p")).getText();
        assertTrue(OrderDone.contains("Congratulations, your order is complete"));
        driver.close();
    }
}
