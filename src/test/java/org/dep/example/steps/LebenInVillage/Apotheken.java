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

public class Apotheken extends Driver {
    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Auth|Apotheken")
    public void auth_Apotheken() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open stage|Apotheken")
    public void open_stage_Apotheken() {
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

    @Given("Open LebenStage|Apotheken")
    public void open_LebenStage_Apotheken() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/ul/li[5]/a/span")).click();
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")).getText();
        assertTrue(loginString.contains("Alle Informationen rund um die Gemeinde"));
        System.out.println("Открыта страница Leben in Stage");
    }

    @Given("Click botton Öffnungszeiten|Apotheken")
    public void click_botton_Öffnungszeiten_Apotheken() {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/a[1]/div/div")).click();
        System.out.println("Открыта страница Öffnungszeiten");
    }

    @When("Click to botton Hinzufügen||Apotheken")
    public void click_to_botton_Hinzufügen_Apotheken() {
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[1]/div/h3")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[1]/div/h3")).getText();
        assertTrue(loginString.contains("Öffnungszeiten"));
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[2]/button")).click();
    }

    @When("Enter Einrichtung|Apotheken")
    public void enter_Einrichtung_Apotheken() {
        driver.findElement(By.id("name")).sendKeys(Einrichtung +n);

    }

    @When("Enter Telefon|Apotheken")
    public void enter_Telefon_Apotheken() {
        driver.findElement(By.id("phone")).sendKeys(Telefon +n);

    }

    @When("Enter Webseite|Apotheken")
    public void enter_Webseite_Apotheken() {
        driver.findElement(By.id("web-site")).sendKeys(Webseite);

    }

    @When("Enter Hausnummer|Apotheken")
    public void enter_Hausnummer_Apotheken() {
        driver.findElement(By.id("street")).sendKeys(Hausnummer);

    }

    @When("Enter Postleitzahl|Apotheken")
    public void enter_Postleitzahl_Apotheken() {
        driver.findElement(By.id("zip-code")).sendKeys(Postleitzahl);

    }

    @When("Enter Ort|Apotheken")
    public void enter_Ort_Apotheken() {
        driver.findElement(By.id("city")).sendKeys(Ort);

    }

    @When("Select Öffnungszeiten|Apotheken")
    public void select_Öffnungszeiten_Apotheken() {
        driver.findElement(By.xpath("//*[@id=\"create-organization-form\"]/div[2]/div[2]/div[3]/span/span[1]/input")).click();
        System.out.println("Понедельник выбран выходным + к СБ и ВС");
    }

    @When("Enter Anmerkungen|Apotheken")
    public void enter_Anmerkungen_Apotheken() {
        driver.findElement(By.id("note")).sendKeys(Anmerkungen +n);

    }

    @When("Select Reichweite|Apotheken")
    public void select_Reichweite_Apotheken() {
        System.out.println("Расшарить всем - выбрано по умолчанию");

    }

    @When("Click Absenden|Apotheken")
    public void click_Absenden_Apotheken() {
        driver.findElement(By.xpath("//*[@id=\"create-organization-form\"]/button/span[1]")).click();

    }

    @Then("Form send Successful|Apotheken")
    public void form_send_Successful_Apotheken() {
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")).getText();
        assertTrue(loginString.contains(Einrichtung +n));
        System.out.println("Открыта главная страница");
    }

    @Then("Close Browser|Apotheken")
    public void close_Browser_Apotheken() {
        driver.close();
    }
}
