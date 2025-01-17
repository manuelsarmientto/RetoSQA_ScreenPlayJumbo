package co.tiendasjumbo.runners;

import co.tiendasjumbo.utils.BeforeSuite;
import co.tiendasjumbo.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AgregarCarrito",
        glue = "co.tiendasjumbo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(RunnerPersonalizado.class)
public class AgregarProductoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/agregarProducto.feature");
    }
}
