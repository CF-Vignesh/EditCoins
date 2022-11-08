package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditCoins {

	public static void main(String[] args) throws InterruptedException {

		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://cf-customer-qa.devcoinfantasy.co.in");
		  driver.manage().window().maximize();
		
		// login
		Thread.sleep(2000);
		driver.findElement(By.id("text")).sendKeys("dilipthathera@gmail.com");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='0']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='1']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='2']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='3']")).sendKeys("0");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(3000);

		// join now
		driver.findElement(By.xpath("//span[contains(@class,'flex gap-1 lg:gap-2 items-center justify-center')]")).click();

		
		// select coins
		// low cap
		Thread.sleep(3000);

		// sort option - price

		driver.findElement(By.xpath("//button[text()='Price']")).click();
		Thread.sleep(2000);

		// scroll
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(1000);
		  js.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1700");
		  Thread.sleep(2000);
		 
		// low cap (+)

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[17]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[18]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='5x']/..")).click();
		 
		
		/*
		 * driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[21]")).click();
		 * driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		 * driver.findElement(By.xpath("//button[text()='3x']/..")).click();
		 */
		
		
		// mid cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][2]")).click();
		Thread.sleep(3000);
		
		/*
		 * // scroll JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * Thread.sleep(1000); js2.executeScript(
		 * "document.querySelector(\"div[id='coinLister']\").scrollTop=1500");
		 * Thread.sleep(2000);
		 */
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();
		 
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Up']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();

		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[4]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='4x']/..")).click();
		  
		 		 
		// high cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][3]")).click();
		Thread.sleep(3000);

		// scroll
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js1.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1700");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[20]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[21]")).click();
		driver.findElement(By.xpath("//button[text()='Up']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();

		
		/*
		 * driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[17]")).click();
		 * driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		 * driver.findElement(By.xpath("//button[text()='5x']/..")).click();
		 */
		
		Thread.sleep(3000);
		// Join game
		driver.findElement(By.xpath("//button[text()='Join Game']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View Game']")).click();
		Thread.sleep(3000);
		
		//Fetch the selected coins
		System.out.println("List of Coins selected : ");
		String ele1 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[1]//div[2]/div[1]")).getText();
		System.out.println(ele1);
		String ele2 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[2]//div[2]/div[1]")).getText();
		System.out.println(ele2);
		String ele3 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[3]//div[2]/div[1]")).getText();
		System.out.println(ele3);
		String ele4 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[4]//div[2]/div[1]")).getText();
		System.out.println(ele4);
		String ele5 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[5]//div[2]/div[1]")).getText();
		System.out.println(ele5);
		String ele6 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[6]//div[2]/div[1]")).getText();
		System.out.println(ele6);
		String ele7 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[7]//div[2]/div[1]")).getText();
		System.out.println(ele7);
		
		//Edit 
		driver.findElement(By.className("cursor-pointer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][2]")).click();
		Thread.sleep(2000);
		
		//delete the previous selected coin
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js3.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1700");
		Thread.sleep(2000);
		
		//select another coin
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[20]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();
		
		//repeat
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js4.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[18]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();
		Thread.sleep(2000);
		//update
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		 
		//get updated coin list
		System.out.println("List of Coins updated : ");
		String ele8 = driver.findElement(By.xpath("//div[@class='border-b flex']//div[2]/div")).getText();
		System.out.println(ele8);
		String ele9 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[2]//div[2]/div[1]")).getText();
		System.out.println(ele9);
		String ele10 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[3]//div[2]/div[1]")).getText();
		System.out.println(ele10);
		String ele11 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[4]//div[2]/div[1]")).getText();
		System.out.println(ele11);
		String ele12 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[5]//div[2]/div[1]")).getText();
		System.out.println(ele12);
		String ele13 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[6]//div[2]/div[1]")).getText();
		System.out.println(ele13);
		String ele14 = driver.findElement(By.xpath("//div[@class='h-[70vh] overflow-y-scroll scrollbar']/div[7]//div[2]/div[1]")).getText();
		System.out.println(ele14);
		
	}
}


