package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DriverSetup {
    private static WebDriver driver;

    @BeforeClass
    public static void driverSetup() {
        String URLWebsiteUnderTest = "https://www.depurtat.ro/";
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/mac/geckodriver");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/windows/geckodriver.exe");

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

    @AfterClass
    public void driverTeardown() {
        driver.quit();
    }
}
