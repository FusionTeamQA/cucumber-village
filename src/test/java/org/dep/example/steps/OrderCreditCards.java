package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderCreditCards extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец


    @Given("OpenBrowser |CreditCards")
    public void openbrowser_CreditCards() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open page Brink DEV |CreditCards")
    public void open_page_Brink_DEV_CreditCards() {
        driver.get(URL);
        System.out.println("Открыта страница ДЕВ");
    }

    @Given("Enter User |CreditCards")
    public void enter_User_CreditCards() {
        System.out.println("Введен Юзер");

    }

    @Given("Enter Pass |CreditCards")
    public void enter_Pass_CreditCards() {
        System.out.println("Введен пароль");

    }

    @Given("Click botton OK |CreditCards")
    public void click_botton_OK_CreditCards() throws InterruptedException {
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

    @When("Click botton Profile |CreditCards")
    public void click_botton_Profile_CreditCards() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div")).click();
        System.out.println("Открыт попап - профиль");
        Thread.sleep(1000);
    }

    @When("Enter Benutzername \\(E-Mail) |CreditCards")
    public void enter_Benutzername_E_Mail_CreditCards() {
        driver.findElement(By.id("auth_modal_email")).sendKeys(USER_admin);
        System.out.println("Введена почта qq@qq.qq");
    }

    @When("Enter Passwort |CreditCards")
    public void enter_Passwort_CreditCards() {
        driver.findElement(By.id("auth_modal_password")).sendKeys(PASSWORD_admin);
        System.out.println("Введен 12345678");
    }

    @When("Click botton Anmelden und weiter |CreditCards")
    public void click_botton_Anmelden_und_weiter_CreditCards() throws InterruptedException {
        driver.findElement(By.xpath("//eg-auth-modal/eg-modal/div[2]/eg-auth-form/div/form/div[3]/button")).click();
        System.out.println("Нажата кнопка авторизации");
        String LoginString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div/span")).getText();
        assertTrue(LoginString.contains("qq"));
        System.out.println("Логин соответствует почте");
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/div[1]/div/div/div[6]/div/div[1]/eg-lang-switcher/div/span[1]")).click();
        Thread.sleep(1500);
    }

    @When("Select category American Diner im Cinecitta|CreditCards")
    public void select_category_American_Diner_im_Cinecitta_CreditCards() throws InterruptedException {
        driver.get("https://dev.brinc.de/vendor/VmVuZG9yOjEw");
        System.out.println("Открыта вкладка American Diner im Cinecitta ");
        Thread.sleep(1500);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")));
    }

    @When("Choose the quantity of the product \" Arizona Iced Tea Blueberry“ in the size of {int} pcs|CreditCards")
    public void choose_the_quantity_of_the_product_Arizona_Iced_Tea_Blueberry_in_the_size_of_pcs_CreditCards(Integer int1) {
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        System.out.println("Выбрано 5 товаров ");
    }

    @When("Add an item to the cart|CreditCards")
    public void add_an_item_to_the_cart_CreditCards() {
        try {
            driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/div")).click();
            String CartString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[1]/div/mat-icon/div")).getText();
            assertTrue(CartString.contains("5"));
            System.out.println("Товаров 5 в корзине - тест продолжен");
        }catch (WebDriverException exception) {
            System.out.println("Товаров не 5 в корзине, тест прекращен");
            driver.close();
        }
    }

    @When("Click botton cart|CreditCards")
    public void click_botton_cart_CreditCards() {
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]")));
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]")).click();
        System.out.println("Нажата кнопка - Корзина ");
    }

    @When("Click botton checkout|CreditCards")
    public void click_botton_checkout_CreditCards() throws InterruptedException {
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/button")));
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/button")).click();
        System.out.println("Нажата кнопка Checkout");
        Thread.sleep(3000);

    }

    @When("Click Continue|CreditCards")
    public void click_Continue_CreditCards() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebDriverWait wait4 = new WebDriverWait(driver,30);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button")));
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

    @When("Select type CreditCards|CreditCards")
    public void select_type_GiroPay_CreditCards() {
        Actions actions = new Actions(driver);
        WebElement radioCreditCards = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[2]/eg-checkout-payment/eg-load-container/div/form/div[1]/eg-checkout-payment-method[4]"));
        actions.moveToElement(radioCreditCards).perform();
        radioCreditCards.click();
    }

    @When("Check the box on \"I hereby accept Egourmery's Terms and conditions and Privacy policy“|CreditCards")
    public void check_the_box_on_I_hereby_accept_Egourmery_s_Terms_and_conditions_and_Privacy_policy_CreditCards() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkout_payment_privacy\"]/div/mat-icon"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox).perform();
        checkbox.click();
        Thread.sleep(1500);
        System.out.println("Выбран чекбокс Terms and conditions and Privacy policy");
    }

    @When("Enter your Cardholder Name|CreditCards")
    public void enter_your_Cardholder_Name_CreditCards() {
        driver.findElement(By.xpath("//*[@id=\"cardholder-name\"]")).sendKeys(namescard);
        System.out.println("Введен" + namescard);

    }

    @When("Enter your Credit Card Number|CreditCards")
    public void enter_your_Credit_Card_Number_CreditCards() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input")).sendKeys(test_card);
//        WebElement Number = driver.findElement(By.xpath("//*[@id=\"card-number\"]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(Number).perform();
//        Number.click();
//        Number.sendKeys(test_card);
        System.out.println("Введен Card Number" + test_card);
    }

    @When("Enter your Expiration|CreditCards")
    public void enter_your_Expiration_CreditCards() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("card-expiry")));
        driver.findElement(By.id("card-expiry")).sendKeys(dataexpiration);
//        WebElement Expirations = driver.findElement(By.xpath("//*[@id=\"card-expiry\"]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(Expirations).perform();
//        Expirations.click();
//        Expirations.sendKeys(test_card);
//        Expirations.sendKeys(dataexpiration);
        System.out.println("Введен Expiration" + dataexpiration);


    }

    @When("Enter your CVC Code|CreditCards")
    public void enter_your_CVC_Code_CreditCards() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.elementToBeClickable(By.id("card-cvc")));
        driver.findElement(By.id("card-cvc")).sendKeys(pass_log);
//        WebElement CVC = driver.findElement(By.xpath("//*[@id=\"card-cvc\"]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(CVC).perform();
//        CVC.click();
//        CVC.sendKeys(pass_log);
        System.out.println("Введен CVC" + pass_log);
        Thread.sleep(1500);


    }
    @When("Click on \" Complete order“|CreditCards")
    public void click_on_Complete_order_OrderCash() {
        driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button[2]")).click();
        System.out.println("Нажата кнопка Complete order");
    }

    @Then("Order complete, browser closed|CreditCards")
    public void order_complete_browser_closed_CreditCards() throws InterruptedException {
        Thread.sleep(1500);
        String OrderDone = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/eg-checkout-payment-result/p")).getText();
        assertTrue(OrderDone.contains("Congratulations, your order is complete"));
        driver.close();
    }
}
