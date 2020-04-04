package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DriverSetup {
    private static WebDriver driver;

    @BeforeClass
    public static void driverSetup() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/windows/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverSetup.driver = driver;
    }

    @AfterClass
    public void driverTeardown() {
        driver.quit();
    }
}
