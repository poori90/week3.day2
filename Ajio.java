package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch the URL https://www.ajio.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
			//2. In the search box, type as "bags" and press enter
		WebElement ele = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		ele.sendKeys("bags");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
			//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
			//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
			//5. Print the count of the items Found. 
			String count = driver.findElement(By.className("length")).getText();
			System.out.println("The count of Items found : " + count);
			//6. Get the list of brand of the products displayed in the page and print the list.
			System.out.println("*****Brands of the Prodcuts ******");
			List <WebElement> brand = driver.findElements(By.className("brand"));
			
			for (WebElement eachElement : brand) {
				String str = eachElement.getText();
				System.out.println(str);
				
			}
			//7. Get the list of names of the bags and print it
			System.out.println("*****Bag Names to Print ******");
			
			List <WebElement> bags = driver.findElements(By.className("name"));
			
			for (WebElement eachElement : bags) {
				String str = eachElement.getText();
				System.out.println(str);
				
			}
			

	}

}
