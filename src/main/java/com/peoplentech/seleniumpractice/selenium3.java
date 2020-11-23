package com.peoplentech.seleniumpractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class selenium3 extends TestBase{

    //xpath rules
    //tagName[text()='_______']---> text
    //tagName[@attribute='_____']--->id/class/aria-label etc

    //@Test
    //public static void validateUserCanTypeOnSearchBar(){
      //  setDriver();
      //  navigateToURL("https://www.ebay.com");
       // driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
       // sleepFor(5000);
       // driver.close();

        //validateUserCanTypeSearchBar();
        //validateUserCanTypeOnSearchBarAndClickSearchButton();


    @Test
    public static void validateUserCanTypeOnSearchBarAndClickSearchButton(){
        setupDriver();
        navigateToURL("https://www.ebay.com");

        //driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
        //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        sleepFor(second:5000);
        driver.close();
    }
    @Tset
    public static void validateProductDropDown(){
        setDriver();
        navigateToURL("https://www.ebay.com");
    //print all the data directly
        String data = driver.findElement(By.xpath("//select[@id='gh-cat']")).getText();
        System.out.println(data);
    //get all the elements in the list
        List<WebElement> dragDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
        System.out.println(dropdown.size());

        dropDown.get(5).click();

        sleepFor(5000);
        closeDriver();

    }
    @Test
    public static void validateUserCanTypeOnSearchBarAndChooseFromDropDown(){}
          setupDriver();
          //open the browser
          navigateToURL("https://www.ebay.com");

          //enter java books in search bar
          driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys(keysToSend "java books");

          //find books and click on it
          List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
          System.out.println(dropDown.size());
          dropDown.get(5).click();

          //click search button
          driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

          //Another way
          WebElement clickElement = driver.findElement(By.xpath("//input[@id='gh-btn']"));
          clickElement.click();

          sleepFor(5000);
          closeDriver();

          @Test
    public static void seleniumMethods(){
              setDriver();
              navigateToURL("https://www.ebay.com");

              WebElement clickElement = driver.findElement(By.xpath("//input[@id='gh-btn']"));
              clickElement.click();

              driver.findElement(By.xpath)("//h2[text()='ebay Motors'])).click"();

              String currentUrl =driver.getCurrentULR();
              System.out.println(currentUrl);

              sleepFor(5000);
              closeDriver();
          }
}
