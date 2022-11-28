package emrahAppiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest{

    @Test
    public void browserTest(){
        //driver.get("https://www.google.com/");
        //System.out.println(driver.getTitle());
        //driver.findElement(By.name("q")).sendKeys("amazon");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.className("navbar-toggler-icon")).click();
        driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)","");
        String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
        Assert.assertEquals(text, "Devops");


    }
}
