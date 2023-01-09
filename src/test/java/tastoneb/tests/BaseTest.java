package tastoneb.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import taskoneb.DetailProductPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

        private WebDriver driver;
        private static final String DEMOWEBSHOP_URL = "https://demowebshop.tricentis.com/build-your-own-expensive-computer-2";

        @BeforeTest
        public void profileSetUp() {
            chromedriver().setup();
        }


        @BeforeMethod
        public void testSetUp() {
            driver = new ChromeDriver();  //Екземпляр Chrome Driver
            driver.manage().window().maximize();  //Відкрити браузер на весь екран
            driver.get(DEMOWEBSHOP_URL);  //Відкрили потрібний сайт
        }

        @AfterTest
        public void tearDown() {
            driver.close();  //закриття драйвера
        }

        public WebDriver getDriver() {
            return driver;
        }

        public DetailProductPage getDetailProductPage() {
            return new DetailProductPage(getDriver());  //Екземпляр пейджі, потрібно для того щоб визивати метод з класу
        }

    }

