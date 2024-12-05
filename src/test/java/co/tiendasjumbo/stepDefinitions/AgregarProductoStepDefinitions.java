package co.tiendasjumbo.stepDefinitions;

import co.tiendasjumbo.questions.ValidarCarrito;
import co.tiendasjumbo.tasks.AgregarCarritoTask;
import co.tiendasjumbo.tasks.BuscarProductoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.assertj.core.api.Assertions.assertThat;

public class AgregarProductoStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la pagina {string}")
    public void queMeEncuentroEnLaPagina(String url) {
        WebDriverManager.chromedriver().setup();
        theActorCalled("analista").wasAbleTo(Open.url(url));
    }

    @Cuando("busco el producto {string}{string}")
    public void buscoElProducto(String producto, String marca) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarProductoTask.conElProducto(producto, marca)
        );
    }

    @Cuando("diligencio los datos de entrega {string}{string}{string}{string}{string}")
    public void diligencioLosDatosDeEntrega(String correo, String departamento, String ciudad, String direccion, String complemento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCarritoTask.conLosDatos(correo, departamento, ciudad, direccion,complemento)
        );
    }

    @Entonces("Visualizare {string} en el carrito")
    public void visualizareEnElCarrito(String producto) {
        String textoCarrito = ValidarCarrito.producto().answeredBy(OnStage.theActorInTheSpotlight());
        assertThat(textoCarrito).contains(producto.toUpperCase());
    }
}
