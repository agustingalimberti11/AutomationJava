import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.FlightsPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsPOMTest {

    WebDriver driver = null;
    private static final String BASE_URL = "https://demo.guru99.com/test/newtours/index.php";

    @BeforeEach
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


    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
