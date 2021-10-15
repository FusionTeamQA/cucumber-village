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

    public static final String URL = "https://user:123@dev.brinc.de";
    public static final String USER_admin = "qq@qq.qq";
    public static final String PASSWORD_admin = "12345678";
    public static final String user_log = "user";
    public static final String pass_log = "123";
    public static final String test_card = "4111111111111111";
    public static final String namescard = "Test Auto";
    public static final String dataexpiration = "1222";



}

//    Date date = new Date();


