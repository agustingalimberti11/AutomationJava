package clasesAnteriores;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.clasesAnteriores.FlightsPage;
import org.example.pages.clasesAnteriores.HomePage;
import org.example.pages.clasesAnteriores.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightsPOMTest {

    WebDriver driver = null;
    private static final String BASE_URL = "https://demo.guru99.com/test/newtours/index.php";

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testBuscarVuelo(){
        //instanciar la page LoginPage usando Page Factory
        LoginPage login = new LoginPage(driver);
        login.login("pedro", "123");
        HomePage home = new HomePage(driver);
        home.clickFlights();
        FlightsPage flight = new FlightsPage(driver);
        flight.clickContinuar();
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
