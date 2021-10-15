package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

public class SchadensmelderPositive extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Auth|SchadensmelderPositive")
    public void auth_SchadensmelderPositive() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open stage|SchadensmelderPositive")
    public void open_stage_SchadensmelderPositive() {
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

    @Given("Open LebenStage|SchadensmelderPositive")
    public void open_LebenStage_SchadensmelderPositive() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/ul/li[5]/a/span")).click();
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")).getText();
        assertTrue(loginString.contains("Alle Informationen rund um die Gemeinde"));
        System.out.println("Открыта страница Leben in Stage");
    }

    @Given("Click botton Schadensmelder|SchadensmelderPositive")
    public void click_botton_Schadensmelder_SchadensmelderPositive() {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/a[2]/div/div")).click();
    }

    @When("Enter Name|SchadensmelderPositive")
    public void enter_Name_SchadensmelderPositive() {
        driver.findElement(By.id("name")).sendKeys(Einrichtung +n);

    }

    @When("Enter Telefon|SchadensmelderPositive")
    public void enter_Telefon_SchadensmelderPositive() {
        driver.findElement(By.id("phone")).sendKeys(Telefon +n);

    }

    @When("Enter eMail-Adresse|SchadensmelderPositive")
    public void enter_eMail_Adresse_SchadensmelderPositive() {
        driver.findElement(By.id("email")).sendKeys(Email);

    }

    @When("Select Datum|SchadensmelderPositive")
    public void select_Datum_SchadensmelderPositive() {
        driver.findElement(By.id("date")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div[6]/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]/span[1]")).click();
    }

    @When("Enter Standort|SchadensmelderPositive")
    public void enter_Standort_SchadensmelderPositive() {
        driver.findElement(By.id("location")).sendKeys(Ort);
    }

    @When("Enter Beschreibung des Schadens|SchadensmelderPositive")
    public void enter_Beschreibung_des_Schadens_SchadensmelderPositive() {
        driver.findElement(By.id("description")).sendKeys(Anmerkungen +n);
    }

    @When("Click radiobotton Hiermit bestätigen Sie die|SchadensmelderPositive")
    public void click_radiobotton_Hiermit_bestätigen_Sie_die_SchadensmelderPositive() {
        driver.findElement(By.id("confirmation")).click();
    }

    @Then("Form send Successful|SchadensmelderPositive")
    public void form_send_Successful_SchadensmelderPositive() {
        driver.findElement(By.xpath("//*[@id=\"create-report-form\"]/button/span[1]")).click();
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/span")));
        String loginString = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/span")).getText();
        assertTrue(loginString.contains("Erfolgreich gesendet!"));
        System.out.println("Форма отправлена");
        WebDriverWait wait4 = new WebDriverWait(driver,30);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/button/span[1]")));
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/button/span[1]")).click();
        System.out.println("Нажата кнопка Fertig");
    }

    @Then("Close Browser|SchadensmelderPositive")
    public void close_Browser_SchadensmelderPositive() {
        driver.close();
    }
}
