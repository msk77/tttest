import org.apache.xpath.SourceTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class App {




        private WebDriver driver;
        private WebDriverWait wait;


        @Before
        public void start(){
            //System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);

        }


        @Test
        public void myFirstTest() throws InterruptedException {
            driver.get("http://google.com");
            try {driver.findElement(By.name("q")).sendKeys("webdriver");
                driver.findElement(By.name("q")).sendKeys(Keys.RETURN);}
            catch (Exception exc){
                System.out.println("Exception found");

            }


            wait.until(titleIs("webdriver - Google Search"));
        }

        @After
        public void stop(){
            driver.quit();
            driver = null;
        }


}
