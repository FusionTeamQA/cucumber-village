package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EditUserName extends Driver{

    WebDriver driver = null;
    Date date = new Date();
    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) +3; // +3 в конец


    @Given("^Open browser editusername$")
    public void open_browser_editusername() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/fusion_tech/Documents/test1/CucumberTest/src/test/resources/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");

    }

    @Given("^open page Staff DEV editusername$")
    public void open_page_Staff_DEV_editusername() throws Exception {
        driver.get(URL);
        System.out.println("Открыта страница Стафа ДЕВ");
        Thread.sleep(3000); //засыпание на 3 сек
        driver.findElement(By.name("login")).sendKeys(USER_admin);
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(1000);
        System.out.println("Данные юзера введены");
    }

    @Given("^open page info sotr editusername$")
    public void open_page_info_sotr_editusername() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/nav/a[2]/i")).click();
        System.out.println("Открыта страница - Информация о сотруднике");
    }

    @When("^click edit bottom editusername$")
    public void click_edit_bottom_editusername() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/button/span[1]")).click();
        System.out.println("Нажата кнопка редактировать");
    }

    @When("^clear field first name$")
    public void clear_field_first_name() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[2]/div/div/div/input")).sendKeys(Keys.COMMAND + "a");
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[2]/div/div/div/input")).sendKeys(Keys.DELETE);
    }

    @When("^enter first name$")
    public void enter_first_name() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[2]/div/div/div/input")).sendKeys("Account"+n);
    }

    @When("^clear field last name$")
    public void clear_field_last_name() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[3]/div/div/div/input")).sendKeys(Keys.COMMAND + "a");
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[3]/div/div/div/input")).sendKeys(Keys.DELETE);
    }

    @When("^enter last name$")
    public void enter_last_name() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[3]/div/div/div/input")).sendKeys("for Test"+n);

    }

    @When("^Click bottom Save editusername$")
    public void click_bottom_Save_editusername() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"parenWidht\"]/div[3]/div/div/form/div/div[14]/button[2]/span[1]")).click();
    }

    @Then("^First name end Last name changed$")
    public void first_name_end_Last_name_changed() throws Exception {
        System.out.println("Изменения сохранены");
        driver.quit();
    }
}
