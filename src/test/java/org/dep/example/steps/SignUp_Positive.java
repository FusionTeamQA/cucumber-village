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
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUp_Positive extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("OpenBrowser |SignUp")
    public void openbrowser_SignUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");
    }

    @Given("Open page Brink DEV |SignUp")
    public void open_page_Brink_DEV_SignUp() {
        driver.get(URL);
        System.out.println("Открыта страница ДЕВ");
    }

    @Given("Enter User |SignUp")
    public void enter_User_SignUp() {
        System.out.println("Введен Юзер");
    }

    @Given("Enter Pass |SignUp")
    public void enter_Pass_SignUp() {
        System.out.println("Введен пароль");
    }

    @Given("Click botton OK |SignUp")
    public void click_botton_OK_SignUp() throws InterruptedException {
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

    @When("Click botton Profile |SignUp")
    public void click_botton_Profile_SignUp() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div")).click();
        Thread.sleep(1000);
    }

    @When("Click botton Hier registrieren |SignUp")
    public void click_botton_Hier_registrieren_SignUp() throws InterruptedException {
        driver.findElement(By.linkText("Hier registrieren")).click();
        Thread.sleep(1000);
    }

    @When("Enter Benutzername \\(E-Mail) |SignUp")
    public void enter_Benutzername_E_Mail_SignUp() {
        driver.findElement(By.id("reg_modal_email")).sendKeys("TestEmail" + n + "@gmail.com");
        System.out.println("Введена почта TestEmail" + n + "@gmail.com" );
    }

    @When("Enter Passwort |SignUp")
    public void enter_Passwort_SignUp() {
        driver.findElement(By.id("reg_modal_password")).sendKeys("AAAqqq111");
        System.out.println("Введен пароль");
    }

    @When("Enter Passwort wiederholen |SignUp")
    public void enter_Passwort_wiederholen_SignUp() throws InterruptedException {
        driver.findElement(By.id("reg_modal_passwordConfirm")).sendKeys("AAAqqq111");
        System.out.println("Введен повторно пароль");
        Thread.sleep(1500);
    }

    @When("Click botton Registrieren |SignUp")
    public void click_botton_Registrieren_SignUp() throws InterruptedException {
        driver.findElement(By.xpath("//eg-register-modal/eg-modal/div[2]/form/button")).click();
    }

    @Then("Account create successfully browser closed |SignUp")
    public void account_create_successfully_browser_closed_SignUp() {
        String SignupString = driver.findElement(By.xpath("/html/body/eg-root/eg-header/div/eg-header-top/div/div/div/div[2]/div[2]/div[1]/eg-profile-dropdown/eg-dropdown/div[1]/div/span")).getText();
        assertTrue(SignupString.contains("TestEmail" + n));
        System.out.println("Логин соответствует загеристрированной почте");
        driver.close();
    }
}
