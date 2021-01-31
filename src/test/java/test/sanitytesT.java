package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sanitytesT {


    static WebDriver driver;
    public reportFanction rf = new reportFanction(driver);
    static ExtentReports extent;
    static ExtentTest ttb;

    @Before
    public void setUp() throws Exception {

        extent = rf.GetExtent();
        ttb = rf.createTest("sanitytesT", "sanitytesT");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.point-app.net/tabs");
    }

    @After
    public void tearDown() throws Exception {
        extent.flush();
        driver.quit();
    }

    @Test
    public void sanity() throws Exception {

        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 00 - home page", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 00 - cant open", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }

    }
}


