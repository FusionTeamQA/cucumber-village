package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.dep.example.steps.Driver.*;

public class OtgulPartDay extends Driver {

    WebDriver driver = null;
    Date date = new Date();

    @Given("^Open browser OtgulPartDay$")
    public void open_browser_OtgulPartDay() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");
    }

    @Given("^open page Staff DEV OtgulPartDay$")
    public void open_page_Staff_DEV_OtgulPartDay() throws Exception {
        driver.get(URL);
        System.out.println("Открыта страница Стафа ДЕВ");
        Thread.sleep(3000); //засыпание на 3 сек
        driver.findElement(By.name("login")).sendKeys(USER_admin);
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(1000);
        System.out.println("Данные юзера введены");
    }

    @Given("^click leave an application OtgulPartDay$")
    public void click_leave_an_application_OtgulPartDay() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/a/button")).click();
        Thread.sleep(1000);
    }

    @Given("^click type order OtgulPartDay$")
    public void click_type_order_OtgulPartDay() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/button[2]")).click();
        Thread.sleep(1000);
        System.out.println("Выбран тип - Отгул");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div[1]/div/label[2]/span[2]")).click();
        System.out.println("Выбран тип - Отгул в течении дня");
    }

    @When("^user select data OtgulPartDay$")
    public void user_select_data_OtgulPartDay() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/div/div/div[2]/div/div[3]/div[5]/div[3]")).click();
        System.out.println("Выбрана дата");
    }

    @When("^select time start, end$")
    public void select_time_start_end() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div[2]/div[1]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button[2]/span[1]")).click();
        System.out.println("Указано текущее время с промежутком час - Сохранено");

    }

    @When("^enter heading and description OtgulPartDay$")
    public void enter_heading_and_description_OtgulPartDay() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("Отгульная заявка - Заголовок в течении дня" +date);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/textarea[3]")).sendKeys("Отгульная заявка - Комментарий в течении дня" +date);
        System.out.println("Указан заголовок в течении дня + комментарий + дата");

    }

    @When("^click by send OtgulPartDay$")
    public void click_by_send_OtgulPartDay() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/button/span[1]")).click();
        Thread.sleep(1000);
        System.out.println("Нажата кнопка отправить");

    }

    @Then("^OtgulPartDay order send successful$")
    public void otgulpartday_order_send_successful() throws Exception {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/button[1]/span[1]")).click();
        Thread.sleep(1000);
        System.out.println("Нажата кнопка отправить заявку");
    }

    @Then("^Browser closed OtgulPartDay$")
    public void browser_closed_OtgulPartDay() throws Exception {
        driver.quit();
        System.out.println("Браузер закрыт");
    }
}
