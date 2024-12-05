package co.tiendasjumbo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.tiendasjumbo.userinterfaces.InicioUI.*;
import static co.tiendasjumbo.userinterfaces.ResultadoBusquedaUI.ITEM_MARCA;
import static co.tiendasjumbo.userinterfaces.ResultadoBusquedaUI.CHECK_MARCA;
import static co.tiendasjumbo.userinterfaces.ResultadoBusquedaUI.BTN_CERRAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class BuscarProductoTask implements Task {

    private String producto;
    private String marca;

    public BuscarProductoTask(String producto, String marca) {
        this.producto = producto;
        this.marca = marca;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSCAR),
                Enter.theValue(producto).into(CAMPO_BUSCAR),
                Click.on(BTN_BUSCAR),
                WaitUntil.the(ITEM_MARCA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CERRAR),
                Click.on(ITEM_MARCA),
                Click.on(CHECK_MARCA(marca))
        );
    }
    public static BuscarProductoTask conElProducto(String producto, String marca) {
        return new BuscarProductoTask(producto, marca);
    }
}
