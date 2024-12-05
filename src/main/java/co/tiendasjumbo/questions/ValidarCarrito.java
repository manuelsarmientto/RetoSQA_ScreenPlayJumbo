package co.tiendasjumbo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.tiendasjumbo.userinterfaces.InicioUI.BTN_CARRITO;
import static co.tiendasjumbo.userinterfaces.CarritoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarCarrito implements Question<String> {

    @Override
    public String answeredBy (Actor actor){
        WaitUntil.the(TXT_PRODUCTO, isPresent()).forNoMoreThan(10).seconds();
        String textoProducto = the(TXT_PRODUCTO).answeredBy(actor).getText();
        String textoMarca = the(TXT_MARCA).answeredBy(actor).getText();
        return textoProducto.toUpperCase() + " " + textoMarca.toUpperCase();
    }

    public static Question<String> producto(){
        return new ValidarCarrito();
    }
}

