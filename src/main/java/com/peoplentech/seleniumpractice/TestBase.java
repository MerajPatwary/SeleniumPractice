package com.peoplentech.seleniumpractice;

import org.openqa.selenium.WebDriver;

public class TestBase {

    public static WebDriver driver;

    public static void navigateBack(){
        driver.navigate().back();
    }

    public static clickOnElement(String element){
        driver.findElement(By.xpath(element)).click();
    }

    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }
    public static void navigateToURL(String url){
        driver.get(url);
    }

    public static void sleepFor(int second){
        try{
            Thread.sleep(5000);
        }catch(IntrruptedException e){
            e.printStackTrace();

        }
    public static void closeDriver(){
        driver.close();
    }
}



