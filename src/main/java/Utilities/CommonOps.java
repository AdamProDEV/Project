package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {


    public static void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("edge"))
            driver = initEdgeDriver();
        else
            throw new RuntimeException("Invalid platform name stated");

        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    //
    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }


    @BeforeClass
    public void startSession() {
        String platform = "web"; // Check if browser?
        if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome"); // If browser, witch browser??
//        else if (platform.equalsIgnoreCase("mobile"))
//            initBrowser();
        else
            throw new RuntimeException("Invalid platform name stated");

        ManagePages.init(); // Added from ManagePagesClass
    }

    @AfterClass
    public void closeSession() {
        driver.quit();

    }
}
