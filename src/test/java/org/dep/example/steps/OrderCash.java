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

import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderCash extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец


        @Given("OpenBrowser |OrderCash")
        public void openbrowser_OrderCash () {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

        @Given("Open page Brink DEV |OrderCash")
        public void open_page_Brink_DEV_OrderCash () {
        driver.get(URL);
        System.out.println("Открыта страница ДЕВ");
    }

        @Given("Enter User |OrderCash")
        public void enter_User_OrderCash () {
        System.out.println("Введен Юзер");
    }

        @Given("Enter Pass |OrderCash")
        public void enter_Pass_OrderCash () {
        System.out.println("Введен пароль");

    }

        @Given("Click botton OK |OrderCash")
        public void click_botton_OK_OrderCash () throws InterruptedException {
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

        @When("Click botton Profile |OrderCash")
        public void click_botton_Profile_OrderCash () throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div")).click();
        System.out.println("Открыт попап - профиль");
        Thread.sleep(1000);
    }

        @When("Enter Benutzername \\(E-Mail) |OrderCash")
        public void enter_Benutzername_E_Mail_OrderCash () {
        driver.findElement(By.id("auth_modal_email")).sendKeys(USER_admin);
        System.out.println("Введена почта qq@qq.qq");
    }

        @When("Enter Passwort |OrderCash")
        public void enter_Passwort_OrderCash () {
        driver.findElement(By.id("auth_modal_password")).sendKeys(PASSWORD_admin);
        System.out.println("Введен 12345678");
    }

        @When("Click botton Anmelden und weiter |OrderCash")
        public void click_botton_Anmelden_und_weiter_OrderCash () throws InterruptedException {
        driver.findElement(By.xpath("//eg-auth-modal/eg-modal/div[2]/eg-auth-form/div/form/div[3]/button")).click();
        System.out.println("Нажата кнопка авторизации");
        String LoginString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div/span")).getText();
        assertTrue(LoginString.contains("qq"));
        System.out.println("Логин соответствует почте");
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/div[1]/div/div/div[6]/div/div[1]/eg-lang-switcher/div/span[1]")).click();
        Thread.sleep(1500);
    }

        @When("Select category American Diner im Cinecitta|OrderCash")
        public void select_category_American_Diner_im_Cinecitta_OrderCash () throws InterruptedException {
            driver.get("https://dev.brinc.de/vendor/VmVuZG9yOjEw");
            System.out.println("Открыта вкладка American Diner im Cinecitta ");
            Thread.sleep(1500);
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")));
    }

        @When("Choose the quantity of the product \" Arizona Iced Tea Blueberry“ in the size of {int} pcs|OrderCash")
        public void choose_the_quantity_of_the_product_Arizona_Iced_Tea_Blueberry_in_the_size_of_pcs_OrderCash (Integer
        int1) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div[2]/div[2]/div[3]/div[2]/div/eg-counter/button[1]")).click();
        System.out.println("Выбрано 5 товаров ");

    }

        @When("Add an item to the cart|OrderCash")
        public void add_an_item_to_the_cart_OrderCash () {
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
        @When("Click botton cart|OrderCash")
        public void click_botton_cart_OrderCash () {
            WebDriverWait wait3 = new WebDriverWait(driver,30);
            wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]")));
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]")).click();
        System.out.println("Нажата кнопка - Корзина ");

    }

        @When("Click botton checkout|OrderCash")
        public void click_botton_checkout_OrderCash ()  throws InterruptedException {
            WebDriverWait wait2 = new WebDriverWait(driver,30);
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/button")));
            driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[3]/eg-cart-dropdown/eg-dropdown/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/button")).click();
            System.out.println("Нажата кнопка Checkout");
            Thread.sleep(3000);

    }

        @When("Click Continue|OrderCash")
        public void click_Continue_OrderCash () throws InterruptedException {
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

        @When("Check the box on \"I hereby accept Egourmery's Terms and conditions and Privacy policy“|OrderCash")
        public void check_the_box_on_I_hereby_accept_Egourmery_s_Terms_and_conditions_and_Privacy_policy_OrderCash () throws
        InterruptedException {
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkout_payment_privacy\"]/div/mat-icon"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox).perform();
        checkbox.click();
        System.out.println("Выбран чекбокс Terms and conditions and Privacy policy");

    }

        @When("Click on \" Complete order“|OrderCash")
        public void click_on_Complete_order_OrderCash () {
        driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/div/eg-checkout-steps/div[3]/button[2]")).click();
        System.out.println("Нажата кнопка Complete order");

    }

        @Then("Order complete, browser closed|OrderCash")
        public void order_complete_browser_closed_OrderCash () {
        String OrderDone = driver.findElement(By.xpath("/html/body/eg-root/eg-checkout-page/div/div[2]/eg-load-container/div/eg-checkout-payment-result/p")).getText();
        assertTrue(OrderDone.contains("Congratulations, your order is complete"));
        driver.close();
    }

}
