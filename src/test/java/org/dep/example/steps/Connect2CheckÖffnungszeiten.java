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

public class Connect2CheckÖffnungszeiten extends Driver {

    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец
    WebDriver driver = null;
    Date date = new Date();

    @Given("Open leben|Öffnungszeitenconnect{int}")
    public void open_leben_Öffnungszeitenconnect(Integer int1) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.out.println("Открыт браузер");
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
        driver.get("https://stage.villageapp.de/leben");
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")));
        String lebentitle = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/span")).getText();
        assertTrue(lebentitle.contains("Alle Informationen rund um die Gemeinde"));
        System.out.println("Открыта страница Leben in Stage");    }

    @Given("Open Öffnungszeiten|Öffnungszeitenconnect{int}")
    public void open_Öffnungszeiten_Öffnungszeitenconnect(Integer int1) {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/a[1]/div/div")).click();
        System.out.println("Открыта страница Öffnungszeiten");
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[1]/div/h3")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[1]/div/h3")).getText();
        assertTrue(loginString.contains("Öffnungszeiten"));
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[2]/button")).click();
    }

    @Given("create form from {int} connect|Öffnungszeitenconnect{int}")
    public void create_form_from_connect_Öffnungszeitenconnect(Integer int1, Integer int2) {
        driver.findElement(By.id("name")).sendKeys(Einrichtung +n);
        driver.findElement(By.id("phone")).sendKeys(Telefon +n);
        driver.findElement(By.id("web-site")).sendKeys(Webseite);
        driver.findElement(By.id("street")).sendKeys(Hausnummer);
        driver.findElement(By.id("zip-code")).sendKeys(Postleitzahl);
        driver.findElement(By.id("city")).sendKeys(Ort);
        driver.findElement(By.xpath("//*[@id=\"create-organization-form\"]/div[2]/div[2]/div[3]/span/span[1]/input")).click();
        System.out.println("Понедельник выбран выходным + к СБ и ВС");
        driver.findElement(By.id("note")).sendKeys(Anmerkungen +n);
        driver.findElement(By.xpath("//*[@id=\"create-organization-form\"]/div[3]/div[5]/span")).click();
    }

    @Given("send form|Öffnungszeitenconnect{int}")
    public void send_form_Öffnungszeitenconnect(Integer int1) {
        driver.findElement(By.xpath("//*[@id=\"create-organization-form\"]/button/span[1]")).click();
        System.out.println("Форма отправлена");
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/h4")).getText();
        assertTrue(loginString.contains(Einrichtung +n));
        System.out.println("Открыта главная страница");
    }

    @When("logout|Öffnungszeitenconnect{int}")
    public void logout_Öffnungszeitenconnect(Integer int1) {
        driver.get("https://stage.villageapp.de/profile/user-info");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div[2]/div[2]/form/nav/p[4]")).click();
    }

    @When("login for user {int} connect|Öffnungszeitenconnect{int}")
    public void login_for_user_connect_Öffnungszeitenconnect(Integer int1, Integer int2) {
        WebDriverWait wait4= new WebDriverWait(driver,30);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        driver.findElement(By.name("email")).sendKeys(User_Connect2);
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

    @When("Open laben stage|Öffnungszeitenconnect{int}")
    public void open_laben_stage_Öffnungszeitenconnect(Integer int1) throws InterruptedException {
        driver.get("https://stage.villageapp.de/leben");
    }

    @When("Open Öffnungszeitens|Öffnungszeitenconnect{int}")
    public void open_Öffnungszeitens_Öffnungszeitenconnect(Integer int1) {
        driver.get("https://stage.villageapp.de/leben/organizations");
    }

    @Then("Record is correct true|Öffnungszeitenconnect{int}")
    public void record_is_correct_true_Öffnungszeitenconnect(Integer int1) {
        WebDriverWait wait4 = new WebDriverWait(driver,30);
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div/ul")));
        String loginString = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/ul")).getText();
        assertTrue(loginString.contains(Einrichtung +n));
        System.out.println("Открыта главная страница");
    }

    @Then("Close Browser|Öffnungszeitenconnect{int}")
    public void close_Browser_Öffnungszeitenconnect(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
