import org.example.pages.HomePageML;
import org.example.pages.ProductosPage;
import org.example.pages.SummaryProductosPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BusquedaProductosML4 extends BaseTestNG{
    private static final String BASE_URL = "https://www.mercadolibre.com.ar/";

    @BeforeMethod
    public void openPage(){
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
}
