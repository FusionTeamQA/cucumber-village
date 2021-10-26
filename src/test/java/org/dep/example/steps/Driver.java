package org.dep.example.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Driver {

    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец
    WebDriver driver = null;
    Date date = new Date();


    public static final String URL = "https://stage.villageapp.de/login";
    public static final String URL_Gruppen = "https://stage.villageapp.de/gruppen";

    public static final String USER_admin = "oficial4connect@ya.com";
    public static final String PASSWORD_admin = "qweqwe";
    public static final String Einrichtung = "AutoTestQa";
    public static final String Telefon = "1234567";
    public static final String Webseite = "www.testQA.com";
    public static final String Hausnummer = "Street 123";
    public static final String Postleitzahl = "01067";
    public static final String Ort = "Germany";
    public static final String Anmerkungen = "Test Comment";
    public static final String Email = "testqa@test.com";
    public static final String User_Connect2 = "user2connect@ya.com";
    public static final String TitleNews = "TestTitle";
    public static final String Nachricht = "TestComments";
    public static final String Gruppenname = "TestGrooup";


    }

