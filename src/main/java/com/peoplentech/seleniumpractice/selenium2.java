package com.peoplentech.seleniumpractice;

public class selenium2 {

    public static void main(String[]args) {
        userShouldBeAbleToClickOnSignInButton();
           //setupDriver();
           //navigateToURL("https://www.ebay.com");
           //sleepFor(second:10);
           //closeDriver();
    }
    public static void userShouldBeAbleToClickOnSignInButton(){
        setupDriver();
        navigateToURL("https://www.ebay.com");
        sleepFor(5000);

        //a[text(='Sign in']
        //a[text()='register']
        //tagName[text()='text---name---gose---here']
        //a[text(='Sign in'])[1]
        driver.findElement(By.xpath("(//a[text(='Sign in'])[1]")).click();
        sleepFor(5000);
        driver.navigate().back();
        closeDriver();
    }
   public static void setupDriver(){
       System.setProperty("webdriver.chrome.driver", "/Users/merajpatwary/Documents/SeleniumPractice/src/main/resources/chromedriver");
       driver = new ChromeDriver();
   }
   public static void navigateToURL(String url){
        driver.get(url);
   }
   public static void sleepFor(int second){
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
   }
   public static void closeDriver(){
        driver.close();
   }
}
