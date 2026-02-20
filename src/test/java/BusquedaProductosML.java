import org.example.pages.HomePageML;
import org.example.pages.ProductosPage;
import org.example.pages.SummaryProductosPage;
import org.testng.annotations.*;

public class BusquedaProductosML extends BaseTestNG{
    private static final String BASE_URL = "https://www.mercadolibre.com.ar/";

    @BeforeMethod
    public void openPage(){
        driver.get(BASE_URL);
    }

    @DataProvider(name = "productos")
    public Object[][] datosPsuarios() {
        return new Object[][]{
                {"pantalon"},
                {"remera"},
        };
    }
    @Test(description = "Busqueda productos - parametrizado para 2 productos", dataProvider = "productos")
    public void testBusquedaProducto(String producto){
        //instanciar la page LoginPage usando Page Factory
        HomePageML homeML = new HomePageML(driver);
        homeML.buscarProducto(producto);
        SummaryProductosPage summaryProductosML = new SummaryProductosPage(driver);
        summaryProductosML.clickAlPrimerProducto();
        ProductosPage productosML = new ProductosPage(driver);
        productosML.elegirTalle();
    }
}
