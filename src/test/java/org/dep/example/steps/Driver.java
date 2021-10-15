package org.dep.example.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;


import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Driver {

    Random random = new Random(); // добавление рандомных чисел
    int n = random.nextInt(1000) + 3; // +3 в конец

    public static final String URL = "https://stage.villageapp.de/login";
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





}

//    Date date = new Date();


