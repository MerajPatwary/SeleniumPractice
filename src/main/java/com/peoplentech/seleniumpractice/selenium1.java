package com.peoplentech.seleniumpractice;

public class selenium1 {

    public static void main(String[]args) throws InterruptedException{
        //set up data ase chrome driver needs
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //create object for chrome driver
        WebDriver driver = new ChromeDriver();

        //tell chrome driver to go to url...
        driver.get("https://www.gap.com");

        // wait 10 second
        Thread.sleep(10000);

        //close the chrome
        driver.close();
    }
}
