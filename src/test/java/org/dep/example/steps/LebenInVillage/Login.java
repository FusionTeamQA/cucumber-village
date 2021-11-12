package org.dep.example.steps.LebenInVillage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dep.example.steps.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login extends Driver {
    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Open browser|Login")
    public void open_browser_Login() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open stage|Login")
    public void open_stage_Login() {
        driver.get(URL);
        System.out.println("Открыт Stage");
    }

    @When("Enter login|Login")
    public void enter_login_Login() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys(USER_admin);
        System.out.println("Введен логин");
    }

    @When("Enter Password|Login")
    public void enter_Password_Login() {
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        System.out.println("Введен пароль");
    }

    @When("Click button Login|Login")
    public void click_button_Login_Login() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div/button[1]/span")).click();
        System.out.println("Нажата кнопка Login");
    }

    @Then("Successful open home page|Login")
    public void successful_open_home_page_Login() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div/h3")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div/h3")).getText();
        assertTrue(loginString.contains("Stage"));
        System.out.println("Открыта главная страница");

    }

    @Then("Close Browser")
    public void close_Browser() {
        driver.close();
        System.out.println("Тест пройден");
    }



}
