package org.dep.example.steps.news;

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

public class NewsCreatePost extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Auth|NewsCreatePost")
    public void auth_NewsCreatePost() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open stage|NewsCreatePost")
    public void open_stage_NewsCreatePost() {
        driver.get(URL);
        System.out.println("Открыт Stage");
        driver.findElement(By.name("email")).sendKeys(USER_admin);
        System.out.println("Введен логин");
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        System.out.println("Введен пароль");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div/button[1]/span")).click();
        System.out.println("Нажата кнопка Login");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div/h3")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div/h3")).getText();
        assertTrue(loginString.contains("Stage"));
        System.out.println("Открыта главная страница");
    }

    @Given("Click Neuer Beitrag|NewsCreatePost")
    public void click_Neuer_Beitrag_NewsCreatePost() {
        driver.findElement(By.xpath("//*[@id=\"posts-container\"]/div[1]/div/button/span[1]")).click();

    }

    @When("Open form Neuer Beitrag|NewsCreatePost")
    public void open_form_Neuer_Beitrag_NewsCreatePost() {
//        String Beitragtitle = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/span")).getText();
//        assertTrue(Beitragtitle.contains("Neuer Beitrag"));
    }

    @When("Enter Titel der Nachricht|NewsCreatePost")
    public void enter_Titel_der_Nachricht_NewsCreatePost() {
        driver.findElement(By.name("title")).sendKeys(TitleNews + n);
    }

    @When("Enter Nachricht|NewsCreatePost")
    public void enter_Nachricht_NewsCreatePost() {
        driver.findElement(By.xpath("//*[@id=\"new-post-form\"]/div[2]/div/div/div/textarea")).sendKeys(Nachricht + n);
    }

    @When("Click button Posten|NewsCreatePost")
    public void click_button_Posten_NewsCreatePost() {
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/button/span[1]")).click();
    }

    @Then("Form send Successful|NewsCreatePost")
    public void form_send_Successful_NewsCreatePost() {
        System.out.println("Создана запись" + TitleNews + n);
    }

    @Then("Close Browser|NewsCreatePost")
    public void close_Browser_NewsCreatePost() {
        driver.close();
    }

}
