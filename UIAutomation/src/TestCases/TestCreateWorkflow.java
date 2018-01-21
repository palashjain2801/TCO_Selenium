package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCreateWorkflow {
	@Test
	public void createWorkflow() throws InterruptedException {
		Thread.sleep(20000);
		WebElement automationTile = TestLogin.webdriver.findElement(By.xpath("//*[text()='Automation FrameWork']"));
		automationTile.click();

		Thread.sleep(5000);

		WebElement createScenarioB = TestLogin.webdriver.findElement(By.xpath("//*[@id='__button15-inner']"));
		createScenarioB.click();

		Thread.sleep(5000);

		WebElement downArrowB = TestLogin.webdriver.findElement(By.xpath(
				"(//span[@class='sapMPanelExpandableIcon sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer'])[1]"));
		downArrowB.click();

		WebElement canvas = TestLogin.webdriver.findElement(By.xpath("//*[@id='canvas']"));
		
		
		WebElement webi=TestLogin.webdriver.findElement(By.xpath("//*[text()='WEBI_ChangeSource']"));
		
		
		

		Actions action = new Actions(TestLogin.webdriver);
		Thread.sleep(3000);
		action.clickAndHold(webi)
				.moveToElement(canvas, 150, 150).release().build().perform();

		action.moveToElement(canvas, 104, 99).click().build().perform();
		
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMPanelExpandableIcon sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer'])[2]")).click();
		Thread.sleep(3000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMSltArrow'])[1]")).click();
		Thread.sleep(9000);

		TestLogin.webdriver.findElement(By.xpath("//*[text()='DEFAULT']")).click();
		Thread.sleep(9000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMPanelExpandableIcon sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer'])[2]")).click();
		Thread.sleep(10000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMInputValHelpInner sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer'])[1]")).click();
		Thread.sleep(10000);
		TestLogin.webdriver.findElement(By.xpath("//*[text()='Web Intelligence Samples']")).click();
		Thread.sleep(10000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMCbActiveStateOff sapMCbBg sapMCbHoverable sapMCbMark'])[12]")).click();
		Thread.sleep(10000);
		TestLogin.webdriver.findElement(By.xpath("//*[text()='Ok']")).click();
		Thread.sleep(10000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@class='sapMInputValHelpInner sapUiIcon sapUiIconMirrorInRTL sapUiIconPointer'])[2]")).click();
		Thread.sleep(9000);
		TestLogin.webdriver.findElement(By.xpath("(//*[@ class='sapUiTreeNode sapUiTreeNodeCollapsed treeFolder'])[5]")).click();
		Thread.sleep(9000);
		WebElement webicanvas = TestLogin.webdriver.findElement(By.xpath("//*[@id='webicanvasid']"));
		action.clickAndHold(TestLogin.webdriver.findElement(By.xpath("//*[text()='eFashionContext']")))
		.moveToElement(webicanvas, 112, 39).release().build().perform();
		Thread.sleep(15000);
		System.out.println("ZBOOm"); 
 

		
		

		




		
		
	}
}
