package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DriverSetup {
    private static WebDriver driver;
    private static String URLWebsiteUnderTest = "https://www.depurtat.ro/";

    @BeforeClass
    public static void driverSetup() {

        System.setProperty("webdriver.gecko.driver", "./src/main/resources/mac/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLWebsiteUnderTest);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverSetup.driver = driver;
    }

    public static String getURLWebsiteUnderTest() {
        return URLWebsiteUnderTest;
    }

    public static void setURLWebsiteUnderTest(String URLWebsiteUnderTest) {
        DriverSetup.URLWebsiteUnderTest = URLWebsiteUnderTest;
    }

    @AfterClass
    public void driverTeardown() {
        driver.quit();
    }

}
