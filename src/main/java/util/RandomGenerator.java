package util;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RandomGenerator {

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1001);
    }

    public static void highlightElements(WebDriver driver, WebElement... elements) throws InterruptedException {
        for (WebElement element : elements) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='2px solid red'", element);
        }
        Thread.sleep(2000);
    }

    public static String generateRandomEmail() {
        String email = "";
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
        String fistEmailPart = RandomStringUtils.random(8,allowedChars);
        email = fistEmailPart + "@yahoo.com";
        return email;
    }



    private RandomGenerator() {

    }
}
