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

public class MedicalOrders extends Driver {

    WebDriver driver = null;
    Date date = new Date();

    @Given("^Open browser MedicalOrders$")
    public void open_browser_MedicalOrders() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        System.out.println("Открыт браузер");

    }

    @Given("^open page Staff DEV MedicalOrders$")
    public void open_page_Staff_DEV_MedicalOrders() throws Exception {
        driver.get(URL);
        System.out.println("Открыта страница Стафа ДЕВ");
        Thread.sleep(3000); //засыпание на 3 сек
        driver.findElement(By.name("login")).sendKeys(USER_admin);
        driver.findElement(By.name("password")).sendKeys(PASSWORD_admin);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(1000);
        System.out.println("Данные юзера введены");
    }

    @Given("^click leave an application MedicalOrders$")
    public void click_leave_an_application_MedicalOrders() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/a/button")).click();
        Thread.sleep(1000);
    }

    @Given("^click MedicalOrders type order$")
    public void click_MedicalOrders_type_order() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/button[4]")).click();
        Thread.sleep(1000);
    }

    @When("^user select data MedicalOrders$")
    public void user_select_data_MedicalOrders() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[3]/div[3]/div[1]")).click();
        System.out.println("Выбрано с 14го числа");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[3]/div[4]/div[7]")).click();
        System.out.println("по 27е число");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/div[1]/div/div/input")).click();
    }

    @When("^enter heading and description MedicalOrders$")
    public void enter_heading_and_description_MedicalOrders() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Больничная заявка - Заголовок" +date);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea[3]")).sendKeys("Больничная заявка - Комментарий" +date);
        System.out.println("Указан заголовок + комментарий + дата");

    }

    @When("^click by send MedicalOrders$")
    public void click_by_send_MedicalOrders() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div/button/span[1]")).click();
        Thread.sleep(1000);
        System.out.println("Нажата кнопка отправить");

    }

    @Then("^MedicalOrders order send successful$")
    public void medicalorders_order_send_successful() throws Exception {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/button[1]/span[1]")).click();
        System.out.println("Нажата кнопка отправить заявку");
    }

    @Then("^Browser closed MedicalOrders$")
    public void browser_closed_MedicalOrders() throws Exception {
        driver.quit();
        System.out.println("Браузер закрыт");
    }

}
