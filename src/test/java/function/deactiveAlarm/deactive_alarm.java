package function.deactiveAlarm;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deactive_alarm {

    static WebDriver driver;

    public static void main(String[] args) throws Throwable {
    	
   
        String branchName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the branch name > for live-1, for Testing-2, for development-3 : ");
        branchName = scanner.nextLine();

        driver = new ChromeDriver();
        Actions act = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        
        
        System.out.println();
        if (branchName.equals("1") || branchName.equals("1.5")) {
            driver.get("https://live.retteralarm.de/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='E-Mail']")).click();
            act.sendKeys("ADMOV1").perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Passwort eingeben']")).click();
            act.sendKeys("123456").perform();
            Thread.sleep(1000);
            driver.findElement(By.id("addSubmit")).click();
            System.out.println("Branch Name-Retter alarm Live Branch");
            System.out.println("User Name-ADMOV1");
            
        } else if (branchName.equals("2") || branchName.equals("2.5")) {
            driver.get("https://testing.retteralarm.de/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='E-Mail']")).click();
            act.sendKeys("D1MOV1").perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Passwort eingeben']")).click();
            act.sendKeys("123456").perform();
            Thread.sleep(1000);
            driver.findElement(By.id("addSubmit")).click();
            System.out.println("Branch Name-Retter alarm Testing Branch");
            System.out.println("User Name-D1MOV1");
        } else if (branchName.equals("3") || branchName.equals("3.5")) {
            driver.get("https://development.retteralarm.de/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Benutzername oder E-Mail eingeben']")).click();
            act.sendKeys("BH1OVm1").perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Passwort eingeben']")).click();
            act.sendKeys("123456").perform();
            Thread.sleep(1000);
            driver.findElement(By.id("addSubmit")).click();
            System.out.println("Branch Name-Retter alarm Dev Branch");
            System.out.println("User Name-BH1OVm1");
        }
        
        System.out.println();
        Thread.sleep(10000); // Let dashboard load

        int totalAlarms = 0;

        // Repeat for 3 slots
       
            int alarmsClosedInSlot = 0;

            while (true) {
                List<WebElement> closeButtons = driver.findElements(By.xpath("//img[@_ngcontent-ng-c3211318915]"));
                if (closeButtons.size() == 0) break;

          

                try {
                    WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@_ngcontent-ng-c3211318915])[1]")));
                    closeBtn.click();
                    alarmsClosedInSlot++;
                    System.out.println("Alarm no-" + alarmsClosedInSlot + " closed.");
                    Thread.sleep(3000);

                    act.sendKeys(Keys.ENTER).perform();
                    Thread.sleep(4000);

                    driver.navigate().refresh();
                    Thread.sleep(5000);

                } catch (Exception e) {
                    System.out.println("Exception while closing alarm: " + e.getMessage());
                    break;
                }
            }

            if (alarmsClosedInSlot > 0) {
                totalAlarms += alarmsClosedInSlot;
                
            }
        

        System.out.println();
        System.out.println("Total " + totalAlarms + " alarms were closed successfully.");
        System.out.println();
        driver.quit();
        System.out.println("Browser closed successfully.");
        System.out.println("Thank you, have a nice day.");
    }
}