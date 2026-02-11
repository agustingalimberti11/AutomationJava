import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPOMTestNegativos {

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
    public void testLoginFallido(){
        //instanciar la page LoginPage usando Page Factory
        LoginPage login = new LoginPage(driver);
        login.ingresarSoloUsuario("pedro");
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
