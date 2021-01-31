package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PointWEBTest {
    static WebDriver driver;
    public reportFanction rf = new reportFanction(driver);
    static ExtentReports extent;
    static ExtentTest ttb;

    @Before
    public void setUp() throws Exception {
        extent = rf.GetExtent();
        ttb = rf.createTest("POINT  WEB TEST", "POINT  WEB TEST" +
                "A full Functional auto test of the new website");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.point-app.net/tabs/home");
    }

    @After
    public void tearDown() throws Exception {
        extent.flush();
        driver.quit();
    }


    //בר ימין
    @Test
    @Order(0)
    public void rightToolBar() throws Exception     {
        // Store the current window handle
        //String winHandleBefore = driver.getWindowHandle();
        // Perform the click operation that opens new window
        //driver.findElement(By.xpath("//span[@class='btnText btnText--google']")).click();
      //  Thread.sleep(2000);
        // Switch to new window opened
      //  for(String winHandle : driver.getWindowHandles()){
    //        driver.switchTo().window(winHandle);
      //      Thread.sleep(2000);
     //   }
        // Perform the actions on new window
     //   Thread.sleep(2000);
      //  driver.findElement(By.name("identifier")).click();
     //   Thread.sleep(2000);
     //   JavascriptExecutor jse = (JavascriptExecutor) driver;
     //   jse.executeScript("document.getElementById('identifierId').value='avililian112@gmail.com';");
     //   Thread.sleep(2000);
      //  driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
     //   Thread.sleep(2000);
     //   JavascriptExecutor jSe = (JavascriptExecutor) driver;
      //  jSe.executeScript("document.getElementById('password').value='01121995';");
     //   driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
      //  Thread.sleep(5000);
        // Close the new window, if that window no more required
     //   driver.close();
        // Switch back to original browser (first window)
      //  driver.switchTo().window(winHandleBefore);
        // Continue with original browser (first window)
      //  if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
       //     ttb.pass("test 0 -cant sign in with google security alert", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
      //  } else {
     //       ttb.fail("test 0-sign in with google security alert ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
      //  }
        driver.findElement(By.xpath("//span[text()='התחברות באמצעות דואר אלקטרוני']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("ion-input-7-lbl")));
        driver.findElement(By.name("ion-input-7")).sendKeys("pointtest901@gmail.com");
          Thread.sleep(2000);
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("ion-input-8-lbl")));
        driver.findElement(By.name("ion-input-8")).click();
        driver.findElement(By.name("ion-input-29")).sendKeys("med8142871");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='activeBtn submitButton ']")).click();

        //בר ימין
        driver.findElement(By.className("listofdata")).click();
        Thread.sleep(2000);
        //invite Businessman
        driver.findElement(By.xpath("//ion-label[contains(@class,'sc-ion-label-md-h sc-ion-label-md-s')]")).click();

        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 1 - open invite Businessman ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 1- cant open invite Businessman ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='fas fa-times'])[2]")).click();
        driver.findElement(By.xpath("//span[text()=' +']")).click();
        driver.findElement(By.xpath("//input[@class='searchbar-input sc-ion-searchbar-ios']")).sendKeys("באג");
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 2 - cant open invite Businessman ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 2 - open invite Businessman ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);

        //contact us
        driver.findElement(By.xpath("(//ion-label[contains(@class,'sc-ion-label-md-h sc-ion-label-md-s')])[2]")).click();
        driver.findElement(By.tagName("h4")).click();
        if (driver.getClass().equals("md ion-page hydrated")) {
            ttb.pass("test 3 - open contact us ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 3 - cant open contact us ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()=' דווחו על תקלה ']")).click();
        driver.findElement(By.tagName("textarea")).sendKeys("u have a PROBLEM!");
        driver.findElement(By.xpath("//button[contains(@class,'button4 ')]")).click();
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 4 - send a contact me mail ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 4 - cant  send a contact me mail ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fas fa-times']")).click();

       //About us
        driver.findElement(By.xpath("(//ion-label[contains(@class,'sc-ion-label-md-h sc-ion-label-md-s')])[3]")).click();
        driver.findElement(By.xpath("//app-about-modal[@class='ion-page']//div")).click();
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 5 - About us ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 5 - cant open About us ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'button4 ')]")).click();

        //create a new business
        driver.findElement(By.xpath("//ion-label[text()='צור עסק חדש']")).click();
        driver.findElement(By.xpath("//span[text()='כן אני רוצה!']")).click();
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 6 -  cant create a new business ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 6 - create a new business", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        //option
        driver.findElement(By.xpath("//i[@class='fas fa-chevron-up']")).click();
        driver.findElement(By.name("ion-input-3")).sendKeys("משולם");
        driver.findElement(By.name("ion-input-4")).sendKeys("סברובסקי");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("avolalaa@gmail.com");
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 7 -  update your setting ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 7 - cant update your setting ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='submitButton ']")).click();
        driver.findElement(By.xpath("//div[text()='עדכן מספר טלפון']")).click();

        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 8 -  update your phone number ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 8 - cant update your phone number ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.name("ion-input-1")).sendKeys("0505232378");

        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 9 -  update your phone number ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 9 - cant update your phone number ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        driver.findElement(By.className("button-inner")).click();
        driver.findElement(By.xpath("//i[@class='fas fa-times-circle']")).click();
        driver.findElement(By.xpath("//i[@class='fas fa-chevron-left']")).click();
        driver.findElement(By.xpath("//i[@class='fas fa-chevron-left']")).click();
        if (driver.getTitle().equals("Point - זימון תורים בקליק")) {
            ttb.pass("test 9 - log of ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        } else {
            ttb.fail("test 9 - cant log of ", MediaEntityBuilder.createScreenCaptureFromPath(rf.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
    }


    }