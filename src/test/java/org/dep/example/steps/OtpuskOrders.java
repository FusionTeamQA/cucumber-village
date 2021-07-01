package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class OtpuskOrders extends Driver {

    WebDriver driver = null;
    Date date = new Date();


    @Given("Given Open browser Otpuskorders")
    public void given_Open_browser_Otpuskorders() {
        System.setProperty("webdriver.chrome.driver", "/Users/fusion_tech/Documents/test1/CucumberTest/src/test/resources/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println("Открыт браузер");
    }

    @Given("open page Staff DEV Otpuskorders")
    public void open_page_Staff_DEV_Otpuskorders() throws InterruptedException {
        driver.get(URL);
        System.out.println("Открыта страница Стафа ДЕВ");
        Thread.sleep(3000); //засыпание на 3 сек
        driver.findElement(By.name("login")).sendKeys(USER_admin);
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(1000);
        System.out.println("Данные юзера введены");
    }

    @Given("click leave an application Otpuskorders")
    public void click_leave_an_application_Otpuskorders() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/a/button")).click();
        Thread.sleep(1000);
    }

    @Given("click Otpuskorders type order")
    public void click_Otpuskorders_type_order() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/button[3]")).click();
        Thread.sleep(1000);
    }

    @When("user select data Otpuskorders")
    public void user_select_data_Otpuskorders() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[3]/div[5]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[3]/div[5]/div[7]")).click();
    }

    @When("enter heading and description Otpuskorders")
    public void enter_heading_and_description_Otpuskorders() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Отпуск заявка - Заголовок" +date);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea[3]")).sendKeys("Отпуск заявка - Комментарий" +date);
        System.out.println("Указан заголовок + комментарий + дата");
    }

    @When("click by send Otpuskorders")
    public void click_by_send_Otpuskorders() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/button/span[1]")).click();
        Thread.sleep(1000);
        System.out.println("Нажата кнопка отправить");

    }

    @Then("Otpuskorders order send successful")
    public void otpuskorders_order_send_successful() {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/button[1]/span[1]")).click();
        System.out.println("Нажата кнопка отправить заявку");
    }

    @Then("Browser closed Otpuskorders")
    public void browser_closed_Otpuskorders() {
        driver.quit();
        System.out.println("Браузер закрыт");
    }
}
