package org.dep.example.steps.Events;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dep.example.steps.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateLocale extends Driver {

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    @Given("Auth|CreateLocale")
    public void auth_CreateLocale() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
    }

    @Given("Open page Events|CreateLocale")
    public void open_page_Events_CreateLocale() {
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
        driver.get(URL_Events);
    }

    @When("Click button Neues Event|CreateLocale")
    public void click_button_Neues_Event_CreateLocale() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"events-container\"]/div/div/button/span[1]")));
        driver.findElement(By.xpath("//*[@id=\"events-container\"]/div/div/button/span[1]")).click();
    }

    @When("Enter Titel des Events|CreateLocale")
    public void enter_Titel_des_Events_CreateLocale() {
        driver.findElement(By.name("title")).sendKeys(Einrichtung +n);

    }

    @When("Enter Datum auswählen|CreateLocale")
    public void enter_Datum_auswählen_CreateLocale() {
        driver.findElement(By.name("date")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
        System.out.println("Выбрана текущая дата"+ date);
    }

    @When("Enter Uhrzeit wählen|CreateLocale")
    public void enter_Uhrzeit_wählen_CreateLocale() {
        driver.findElement(By.name("start")).sendKeys("1500");

    }

    @When("Enter Ende \\(Optional)|CreateLocale")
    public void enter_Ende_Optional_CreateLocale() {
        driver.findElement(By.name("end")).sendKeys("1800");

    }

    @When("Enter Ort der Veranstaltung \\(Adresse)|CreateLocale")
    public void enter_Ort_der_Veranstaltung_Adresse_CreateLocale() {
        driver.findElement(By.name("address")).sendKeys(Hausnummer);

    }

    @When("Enter Beschreibung|CreateLocale")
    public void enter_Beschreibung_CreateLocale() {
        driver.findElement(By.xpath("//*[@id=\"new-event-form\"]/div[6]/textarea")).sendKeys(Anmerkungen);

    }

    @When("Click botton Weiter|CreateLocale")
    public void click_botton_Weiter_CreateLocale() {
        driver.findElement(By.xpath("//*[@id=\"new-event-form\"]/button/span[1]")).click();

    }

    @When("Select type Locale|CreateLocale")
    public void select_type_Locale_CreateLocale() {
        driver.findElement(By.xpath("//*[@id=\"scroll-container\"]/div[2]/div/li[2]/b")).click();
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"scroll-container\"]/div[2]/div/button/span[1]")));
    }

    @When("Click botton Weitertwo|CreateLocale")
    public void click_botton_Weitertwo_CreateLocale() {
        driver.findElement(By.xpath("//*[@id=\"scroll-container\"]/div[2]/div/button/span[1]")).click();

    }

    @When("Upload image|CreateLocale")
    public void upload_image_CreateLocale() {
        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
        fileInput.sendKeys("/Users/fusion_tech/Documents/testImg/test-img.png");
    }

    @When("Click button Veröffentlichen|CreateLocale")
    public void click_button_Veröffentlichen_CreateLocale() {
        driver.findElement(By.xpath("//*[@id=\"scroll-container\"]/div[2]/div/div[2]/button/span[1]")).click();
    }

    @Then("Event spontanes succesfull create|CreateLocale")
    public void event_spontanes_succesfull_create_CreateLocale() {
        System.out.println("Создано" + Einrichtung + n);
        String EventName = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div[2]/h3")).getText();
        assertTrue(EventName.contains(Einrichtung + n));
        System.out.println("Проверка на успешное создание - ОК");
    }

    @Then("Close Browser|CreateLocale")
    public void close_Browser_CreateLocale() {
        driver.close();
    }

}
