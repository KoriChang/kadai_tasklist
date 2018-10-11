package kadai_tasklist;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");     // ドライバへのパスを記述

		driver = new ChromeDriver();

	}

	@Test
	public void test() {
		driver.get("http://localhost:8080/kadai_tasklist/index");          // googleにページ遷移
		WebElement element = driver.findElement(By.xpath("//*[@id='header']/h1"));
		String title = element.getText();

		assertThat(title, is("タスク管理 アプリケーション"));

		driver.close();
	}
}
