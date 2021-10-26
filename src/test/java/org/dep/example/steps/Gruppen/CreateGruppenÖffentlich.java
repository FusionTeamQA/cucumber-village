package org.dep.example.steps.Gruppen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dep.example.steps.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateGruppenÖffentlich extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец


    @Given("Auth|CreateGruppenÖffentlich")
    public void auth_CreateGruppenÖffentlich() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open page Gruppen|CreateGruppenÖffentlich")
    public void open_page_Gruppen_CreateGruppenÖffentlich() {
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
        driver.get(URL_Gruppen);
    }

    @When("Click button Neue Gruppe erstellen|CreateGruppenÖffentlich")
    public void click_button_Neue_Gruppe_erstellen_CreateGruppenÖffentlich() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//*[@id=\"groups-container\"]/div[4]/div/div")).click();


    }

    @When("Click botton Suche nach Titelbild z.B. Sommer|CreateGruppenÖffentlich")
    public void click_botton_Suche_nach_Titelbild_z_B_Sommer_CreateGruppenÖffentlich() {
        driver.findElement(By.xpath("//*[@id=\"new-group-form\"]/div[2]/div[1]/input")).click();
    }

    @When("Click random image|CreateGruppenÖffentlich")
    public void click_random_image_CreateGruppenÖffentlich() {
        driver.findElement(By.xpath("//*[@id=\"pixabays-id\"]/img[4]")).click();

    }

    @When("Enter Gruppen name|CreateGruppenÖffentlich")
    public void enter_Gruppen_name_CreateGruppenÖffentlich() {
        driver.findElement(By.name("title")).sendKeys(Gruppenname +n);
        System.out.println("Введено название группы:" + Gruppenname + n);
    }

    @When("Enter Beschreibung|CreateGruppenÖffentlich")
    public void enter_Beschreibung_CreateGruppenÖffentlich() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new-group-form\"]/div[4]/textarea")));
        driver.findElement(By.xpath("//*[@id=\"new-group-form\"]/div[4]/textarea")).sendKeys(Nachricht + n);
        System.out.println("Введено описание группы:" + Nachricht + n);
    }

    @When("Select type gruppen|CreateGruppenÖffentlich")
    public void select_type_gruppen_CreateGruppenÖffentlich() {
        System.out.println("Выбран тип группы Öffentlich");
    }

    @When("Click button Fertig|CreateGruppenÖffentlich")
    public void click_button_Fertig_CreateGruppenÖffentlich() {
        driver.findElement(By.xpath("//*[@id=\"new-group-form\"]/div[6]/button/span[1]")).click();
        System.out.println("Нажата кнопка Fertig");

    }

    @Then("Gruppen succesfull create|CreateGruppenÖffentlich")
    public void gruppen_succesfull_create_CreateGruppenÖffentlich() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"groups-container\"]/h4[1]")));
        String GroopenString = driver.findElement(By.xpath("//*[@id=\"groups-container\"]/h4[1]")).getText();
        assertTrue(GroopenString.contains("Deine Gruppen"));
    }

    @Then("Close Browser|CreateGruppenÖffentlich")
    public void close_Browser_CreateGruppenÖffentlich() {
        driver.close();
    }

}