package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveLogin extends Driver {
    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("OpenBrowser |LoginPositive")
    public void openbrowser_LoginPositive() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");
    }

    @Given("Open page Brink DEV |LoginPositive")
    public void open_page_Brink_DEV_LoginPositive() {
        driver.get(URL);
        System.out.println("Открыта страница ДЕВ");
    }

    @Given("Enter User |LoginPositive")
    public void enter_User_LoginPositive() {
        System.out.println("Введен Юзер");

    }

    @Given("Enter Pass |LoginPositive")
    public void enter_Pass_LoginPositive() {
        System.out.println("Введен пароль");

    }

    @Given("Click botton OK |LoginPositive")
    public void click_botton_OK_LoginPositive() throws InterruptedException {
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

    @When("Click botton Profile |LoginPositive")
    public void click_botton_Profile_LoginPositive() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div")).click();
        Thread.sleep(1000);
    }

    @When("Enter Benutzername \\(E-Mail) |LoginPositive")
    public void enter_Benutzername_E_Mail_LoginPositive() {
        driver.findElement(By.id("auth_modal_email")).sendKeys("qa@qa.qa");
        System.out.println("Введена почта qa@qa.qa");
    }

    @When("Enter Passwort |LoginPositive")
    public void enter_Passwort_LoginPositive() throws InterruptedException {
        driver.findElement(By.id("auth_modal_password")).sendKeys("12345678");
        System.out.println("Введен 12345678");
    }

    @When("Click botton Registrieren |LoginPositive")
    public void click_botton_Registrieren_LoginPositive() throws InterruptedException {
        driver.findElement(By.xpath("//eg-auth-modal/eg-modal/div[2]/eg-auth-form/div/form/div[3]/button")).click();
    }

    @Then("Account login successfully and browser closed |LoginPositive")
    public void account_login_successfully_and_browser_closed_LoginPositive() {
        String LoginString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div/span")).getText();
        assertTrue(LoginString.contains("QAA"));
        System.out.println("Логин соответствует почте");
        driver.close();

    }




}
