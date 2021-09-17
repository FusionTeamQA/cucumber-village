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


public class TechOrder extends Driver {

    WebDriver driver = null;
    Date date = new Date();


    @Given("^Open browser techorder$")
    public void open_browser_techorder() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");
    }

    @Given("^open page Staff DEV techorder$")
    public void open_page_Staff_DEV_techorder() throws Exception {
        driver.get(URL);
        System.out.println("Открыта страница Стафа ДЕВ");
        Thread.sleep(3000); //засыпание на 3 сек
        driver.findElement(By.name("login")).sendKeys(USER_admin);
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(1000);
        System.out.println("Данные юзера введены");
    }

    @Given("^click leave an application$")
    public void click_leave_an_application() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/a/button")).click();
        Thread.sleep(1000);
    }

    @Given("^click Tech type order$")
    public void click_Tech_type_order() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/button[1]")).click();
        Thread.sleep(1000);
    }

    @When("^user select data$")
    public void user_select_data() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/div/div[2]/div/div[3]/div[5]/div[3]")).click();
    }

    @When("^enter heading and description$")
    public void enter_heading_and_description() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[1]/div/div/input")).sendKeys("Техническая заявка - Заголовок" +date);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/textarea[3]")).sendKeys("Техническая заявка - Комментарий" +date);
        System.out.println("Указан заголовок + комментарий + дата");
    }

    @When("^click by send$")
    public void click_by_send() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/button/span[1]")).click();
        Thread.sleep(1000);
        System.out.println("Нажата кнопка отправить");
    }

    @Then("^Tech order send successful$")
    public void tech_order_send_successful() throws Exception {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/button[1]/span[1]")).click();
        System.out.println("Нажата кнопка отправить заявку");
    }
    @Then("^Browser closed techorder$")
    public void browser_closed_techorder() throws Exception {
        driver.quit();
        System.out.println("Браузер закрыт");

    }
}
