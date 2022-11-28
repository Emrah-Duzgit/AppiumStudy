package emrahAppiumTest;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest{

    @Test
    public void ScrollDemoTest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //direkt elemana scroll yapmak için bunu kullanıyoruz
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        //sayfanın sonuna scroll yapmak için bunu kullanıyoruz.
        scrollToEndAction();
        Thread.sleep(2000);

    }
}
