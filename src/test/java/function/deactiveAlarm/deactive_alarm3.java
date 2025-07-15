package function.deactiveAlarm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;





public class deactive_alarm3 {


  public static void main(String[] args) throws Throwable 
  
  {
	 	  
	  System.out.println("please seletct Branch, 1> Live, 2>Testing, 3>Development");
	  Scanner scanner = new Scanner(System.in);
	  String branch = scanner.nextLine();
	  
	  WebDriver driver = new ChromeDriver(); 	
	  Actions act = new Actions (driver);
	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		if (branch.equals ("1"))
		{
			Reporter.log("You have selected Live branch.", true);
			driver.get("https://live.retteralarm.de/admin/users/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"u\"]")).click();
			act.sendKeys("ADMOV1").perform();
			driver.findElement(By.xpath("//input[@id=\"p\"]")).click();
			act.sendKeys("123456").perform();
			driver.findElement(By.xpath("//button[@id=\"addSubmit\"]")).click();
		
		}
		else if (branch.equals("2"))
		{
			
			Reporter.log("You have selected Testing branch.", true);
			driver.get("https://testing.retteralarm.de/admin/users/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"u\"]")).click();
			act.sendKeys("D1MOV1").perform();
			driver.findElement(By.xpath("//input[@id=\"p\"]")).click();
			act.sendKeys("123456").perform();
			driver.findElement(By.xpath("//button[@id=\"addSubmit\"]")).click();
			
		}
		
		
		else if (branch.equals("3"))
		{
			Reporter.log("You have selected Development branch.", true);
			driver.get("https://development.retteralarm.de/admin/users/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"u\"]")).click();
			act.sendKeys("BH1DOVm1").perform();
			driver.findElement(By.xpath("//input[@id=\"p\"]")).click();
			act.sendKeys("123456").perform();
			driver.findElement(By.xpath("//button[@id=\"addSubmit\"]")).click();
		}
		
		else 
		{
			Reporter.log("Wrong Input.", true);
			Reporter.log("Thank you", true);
			driver.close();
			
			
		}
		
		Thread.sleep(7000);
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount1 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();
	
		
		
		if (alarmCount1>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount1+" Alarms available for deletion in 1st slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount1;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		
		
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount2 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();
		
		
		
		if (alarmCount2>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount2+" Alarms available for deletion in 2nd slot.", true);
			
		}
		
		
		for (int i=1;i<=alarmCount2;i++)
		{
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount3 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();
		
		
		
		if (alarmCount3>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount3+" Alarms available for deletion in 3rd slot.", true);
		
		}
		
		
		for (int i=1;i<=alarmCount3;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
	
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount4 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();
		
		
		if (alarmCount4>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount4+" Alarms available for deletion in 4th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount4;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount5 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount5>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount5+" Alarms available for deletion in 5th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount5;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount6 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount6>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount6+" Alarms available for deletion in 6th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount6;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount7 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount7>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount7+" Alarms available for deletion in 7th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount7;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount8 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount8>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount8+" Alarms available for deletion in 8th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount8;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount9 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount9>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount9+" Alarms available for deletion in 9th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount9;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
			
		}
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		int alarmCount10 = driver.findElements(By.xpath("//img[@src='assets/img/icon/close_red.png']")).size();

		
		if (alarmCount10>0)
		
		{
			System.out.println();
			Reporter.log(alarmCount10+" Alarms available for deletion in 10th slot.", true);
		}
		
		
		for (int i=1;i<=alarmCount10;i++)
		{
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='assets/img/icon/close_red.png']")));
			driver.findElement(By.xpath("//img[@src='assets/img/icon/close_red.png']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()=\"Yes, close it!\" or text()=\"Bestätigen\" ]")).click();
			Reporter.log("Alarm Number-"+i+" deletion process going on.", true);
			Thread.sleep(10000);
			
			
			//button[@class=\"swal2-confirm btn btn-primary swal2-styled swal2-default-outline\"]
			
		}
		
		
		
		
		if (alarmCount1<=0)
		{
			System.out.println();
			 Reporter.log(">>>>>No alarms found for deletion.<<<<<", true);
			
		}
		
		else if (alarmCount1 > 0)
		{
			
		System.out.println();
		Reporter.log("Total >>>>>"+(alarmCount1+alarmCount2+alarmCount3+alarmCount4+alarmCount5+alarmCount6+alarmCount7+alarmCount8+alarmCount9+alarmCount10)+ "<<<<< Alarms Cloased sucessfully", true);
		
		
		
		
		}
		

		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src=\"assets/img/icon/gear_white.png\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()= \"Logout\" or text()= \"Abmelden\" ]")).click();
		Thread.sleep(1000);
		
		driver.close();
		System.out.println();
		Reporter.log("User Logout successfully.", true);
		Reporter.log("Browser closed successfully.", true);
		Reporter.log("Thank you, Have a nice day.", true);
		
	
  }

}