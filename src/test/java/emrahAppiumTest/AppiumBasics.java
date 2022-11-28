package emrahAppiumTest;

import org.openqa.selenium.By;

import org.testng.*;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;


public class AppiumBasics extends BaseTest{


    @Test
    public void WifiSettingName()
    {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        Assert.assertEquals(driver.findElement(By.id("android:id/alertTitle")).getText(), "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("emrah wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();   //dikkat! burada findelements kullandık çünkü aynı elemanın 1. indexini çağırdık.
        //classname kullanırken hep AppiumBy kullan

    }


}
