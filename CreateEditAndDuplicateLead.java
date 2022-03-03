package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEditAndDuplicateLead {

	public static void main(String[] args) {

				WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Bacontinuum");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Saravanamathan");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kaliamoorthy");
		WebElement elementCreateLead = driver.findElement(By.className("smallSubmit"));
		elementCreateLead.click();
		WebElement elementDuplicateButton = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateButton.click();
		WebElement elementDuplicateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementDuplicateCompanyName.clear();
		elementDuplicateCompanyName.sendKeys("Bacontinuum2");
		WebElement elementDuplicateFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementDuplicateFirstName.clear();
		elementDuplicateFirstName.sendKeys("Mathan");
		WebElement elementDuplicateLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementDuplicateLastName.clear();
		elementDuplicateLastName.sendKeys("Kaliamoorthy");
		WebElement elementDuplicateCreateLead = driver.findElement(By.className("smallSubmit"));
		elementDuplicateCreateLead.click();
			}

		


		// TODO Auto-generated method stub

	}


