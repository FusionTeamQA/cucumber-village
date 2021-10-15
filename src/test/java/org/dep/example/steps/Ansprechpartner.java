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

public class Ansprechpartner extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Auth|Ansprechpartner")
    public void auth_Ansprechpartner() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open stage|Ansprechpartner")
    public void open_stage_Ansprechpartner() {
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

    @Given("Open LebenStage|Ansprechpartner")
    public void open_LebenStage_Ansprechpartner() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/ul/li[5]/a/span")).click();
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")).getText();
        assertTrue(loginString.contains("Alle Informationen rund um die Gemeinde"));
        System.out.println("Открыта страница Leben in Stage");
    }

    @When("Click botton Übersicht|Ansprechpartner")
    public void click_botton_Übersicht_Ansprechpartner() {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[4]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[2]/button/span[1]")).click();
    }

    @When("Enter Name|Ansprechpartner")
    public void enter_Name_Ansprechpartner() {
        driver.findElement(By.id("name")).sendKeys(Einrichtung +n);

    }

    @When("Enter Beschreibung|Ansprechpartner")
    public void enter_Beschreibung_Ansprechpartner() {
        driver.findElement(By.id("description")).sendKeys(Anmerkungen +n);

    }

    @When("Enter Telefon|Ansprechpartner")
    public void enter_Telefon_Ansprechpartner() {
        driver.findElement(By.id("phone")).sendKeys(Telefon +n);

    }

    @When("Enter eMail-Adresse|Ansprechpartner")
    public void enter_eMail_Adresse_Ansprechpartner() {
        driver.findElement(By.id("email")).sendKeys(Email);

    }

    @When("Enter Webseite|Ansprechpartner")
    public void enter_Webseite_Ansprechpartner() {
        driver.findElement(By.id("web-site")).sendKeys(Webseite);

    }

    @When("Enter Straße und Hausnummer|Ansprechpartner")
    public void enter_Straße_und_Hausnummer_Ansprechpartner() {
        driver.findElement(By.id("street")).sendKeys(Hausnummer);

    }

    @When("Enter Postleitzahl|Ansprechpartner")
    public void enter_Postleitzahl_Ansprechpartner() {
        driver.findElement(By.id("zip-code")).sendKeys(Postleitzahl);

    }

    @When("Enter Ort|Ansprechpartner")
    public void enter_Ort_Ansprechpartner() {
        driver.findElement(By.id("city")).sendKeys(Ort);

    }

    @When("Select Reichweite-Alle|Ansprechpartner")
    public void select_Reichweite_Alle_Ansprechpartner() {
        System.out.println("Расшарить всем - выбрано по умолчанию");
    }

    @Then("Form send Successful|Ansprechpartner")
    public void form_send_Successful_Ansprechpartner() {
        driver.findElement(By.xpath("//*[@id=\"create-club-form\"]/button/span[1]")).click();
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")).getText();
        assertTrue(loginString.contains(Einrichtung +n));
        System.out.println("Открыта главная страница");
    }

    @Then("Close Browser|Ansprechpartner")
    public void close_Browser_Ansprechpartner() {
        driver.close();
    }

}
