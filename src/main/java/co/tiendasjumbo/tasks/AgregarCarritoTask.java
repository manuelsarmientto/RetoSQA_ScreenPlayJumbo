package co.tiendasjumbo.tasks;

import co.tiendasjumbo.interactions.PresionarEnter;
import co.tiendasjumbo.interactions.SimulaSecuenciaTeclas;
import co.tiendasjumbo.interactions.ClickUsingJavaScript;
import co.tiendasjumbo.questions.ObtenerItemsCarrito;
import co.tiendasjumbo.userinterfaces.ResultadoBusquedaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static co.tiendasjumbo.userinterfaces.InicioUI.BTN_CARRITO;
import static co.tiendasjumbo.userinterfaces.InicioUI.NUM_CARRITO;
import static co.tiendasjumbo.userinterfaces.ProductoFiltradoUI.BTN_AGREGAR;
import static co.tiendasjumbo.userinterfaces.ProductoFiltradoUI.BTN_CERRAR;
import static co.tiendasjumbo.userinterfaces.DatosEnvioUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarCarritoTask implements Task {

    private String correo;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String complementoDireccion;
    private String numItems;
    private boolean flag = true;

    public AgregarCarritoTask(String correo, String departamento, String ciudad, String direccion, String complementoDireccion) {
        this.correo = correo;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.complementoDireccion = complementoDireccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_AGREGAR, isPresent()).forNoMoreThan(10).seconds()
        );
        if (BTN_CERRAR.resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                    Click.on(BTN_CERRAR)
            );
        }
        actor.attemptsTo(
                Click.on(BTN_AGREGAR),
                WaitUntil.the(CAMPO_CORREO, isPresent()).forNoMoreThan(10).seconds(),
                Enter.keyValues(correo).into(CAMPO_CORREO),
                Click.on(BTN_ENVIAR),
                WaitUntil.the(SELECT_DEPARTAMENTO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(SELECT_DEPARTAMENTO),
                SimulaSecuenciaTeclas.conTexto(departamento),
                PresionarEnter.ahora(),
                Click.on(SELECT_CIUDAD),
                SimulaSecuenciaTeclas.conTexto(ciudad),
                PresionarEnter.ahora(),
                Enter.keyValues(direccion).into(CAMPO_DIRECCION),
                Enter.keyValues(complementoDireccion).into(CAMPO_COMPLEMENTO_DIRECCION),
                Click.on(BTN_CONFIRMAR)
        );
        while(flag){
            numItems = actor.asksFor(ObtenerItemsCarrito.itemsCarrito());
            System.out.println(actor.asksFor(ObtenerItemsCarrito.itemsCarrito()));
            if(numItems.equals("1")){
                flag = false;
            }
        }
        actor.attemptsTo(
                ClickUsingJavaScript.withTarget(BTN_CARRITO)
        );
    }
    public static AgregarCarritoTask conLosDatos(String correo, String departamento, String ciudad, String direccion, String complementoDireccion) {
        return new AgregarCarritoTask(correo, departamento, ciudad, direccion, complementoDireccion);
    }
}
