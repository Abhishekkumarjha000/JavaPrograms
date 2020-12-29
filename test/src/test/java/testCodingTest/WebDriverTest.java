package testCodingTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class WebDriverTest {
	WebDriver driver = new FirefoxDriver();
	@Before
	public void startup() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		driver.manage().window().maximize();
		// 1. Navigate to the Web Page
		
		// 'https://www.gettyimages.in' and print the Page
		driver.get("https://www.gettyimages.in");
	}
		

	@Test
	public void driverexecerciseTest() {
		
		
		
	
		
		// Title
		
		String title=driver.getTitle();
		System.out.println(title);

		// 2. Click user icon 
		driver.findElement(By.xpath("//a[contains(.,'SIGN IN')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// 3. Click Register tab
		driver.findElement(By.xpath("//div[@class='option-picker__text'][contains(.,'REGISTER')]")).click();
		
		// 4. Enter all the required fields and check the check boxes if they are not checked already
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(checkbox.isSelected()) {
			System.out.println("checkbox is selected ");
		}else
		{
			checkbox.click();
		}
		
		
		driver.findElement(By.xpath("//input[@id='register_first_name']")).sendKeys("abhishek");
		driver.findElement(By.xpath("//input[contains(@name,'register[last_name]')]")).sendKeys("jha");
		
		WebElement dropddownorganisation = driver.findElement(By.xpath("//select[contains(@name,'type]')]"));
		
		Select sel=new Select(dropddownorganisation);
		sel.selectByVisibleText("Design");
		
		driver.findElement(By.xpath("//input[@name='register[organization_name]']")).sendKeys("softcrylic");
		WebElement job_title = driver.findElement(By.xpath("//select[@name='register[job_title]']"));
		Select sel2=new Select(job_title);
		
		sel2.selectByVisibleText("Designer");
		
		driver.findElement(By.xpath("//label[contains(.,'Company email')]")).sendKeys("abc1234@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='register[telephone]']")).sendKeys("9205979984");
		
	
		
		driver.findElement(By.xpath("//label[contains(@for,'register_password')]")).sendKeys("Softcrylic123");
		// 5. Click "Register" button
		driver.findElement(By.xpath("//span[@class='ng-scope'][contains(.,'REGISTER')]")).click();
		// 4. Click "Creative" tab and verify that the user is redirected to the correct page
		
		driver.findElement(By.xpath("//a[@class='text-link--sly action--with-emphasis is-selected']")).click();
		


		
		// 5. Print all the image names in the page and verify there are no duplicates images present
		
		
		String imagename=driver.findElement(By.xpath("//div[@class='square-grid-item__contributor-name']")).getText();
		
			System.out.println(imagename);
			
			String[] images=imagename.split("");
			
			for(int i=0;i<images.length-1;i++) {
				for(int j=i+1;j<images.length;j++)
				{
				
					if(images[i].equalsIgnoreCase(images[j])) {
						System.out.println("duplicates are:"+images[j]);
						
					}
				}
				
			}
		// 6. Click "Create Board" icon and Create the new board
			
					
			
			driver.findElement(By.xpath("//button[contains(.,'BOARDS')]")).click();
			driver.findElement(By.xpath("//input[@required='required']")).sendKeys("abc");
			driver.findElement(By.xpath("//button[contains(@ng-disabled,'!boardName')]")).click();
			
			driver.findElement(By.xpath("(//div[@class='recent-board__icon--right']/preceding-sibling::*)[1]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter asset ID...']")).sendKeys("123");
			driver.findElement(By.xpath("//button[@class='search-icon'][contains(.,'Add')]")).click();
			
		// 7. Add any image to the board and verify it is added successfully
			WebElement imageselect = driver.findElement(By.xpath("(//img[contains(@class,'thumb')])[2]"));
			Actions act=new Actions(driver);
			
			act.moveToElement(imageselect).build().perform();
			driver.findElement(By.xpath("//span[contains(.,'Save')]")).click();
			String savedimaged=driver.findElement(By.xpath("//div[@class='board-toast-content-data-title__title title'][contains(.,'Saved to Board')]")).getText();
			
if(savedimaged.equalsIgnoreCase("Saved to Board")) {
	System.out.println("image saved");
}else {
	System.out.println("image not saved");
}
		
		
	}

	

	@After
	public void teardoen() {
	
		driver.quit();
	}

}
