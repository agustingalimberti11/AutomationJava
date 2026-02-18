import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePageML;
import org.example.pages.ProductosPage;
import org.example.pages.SummaryProductosPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusquedaProductosML {
    WebDriver driver = null;
    private static final String BASE_URL = "https://www.mercadolibre.com.ar/";

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testBusquedaProducto(){
        //instanciar la page LoginPage usando Page Factory
        HomePageML homeML = new HomePageML(driver);
        homeML.buscarProducto();
        SummaryProductosPage summaryProductosML = new SummaryProductosPage(driver);
        summaryProductosML.clickAlPrimerProducto();
        ProductosPage productosML = new ProductosPage(driver);
        productosML.elegirTalle();
    }


    @AfterTest
    public void tearDown(){
        //driver.quit();
    }
}
