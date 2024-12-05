package co.tiendasjumbo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.tiendasjumbo.userinterfaces.InicioUI.NUM_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ObtenerItemsCarrito implements Question<String> {
    private static String numeroItems;

    @Override
    public String answeredBy (Actor actor){
        WaitUntil.the(NUM_CARRITO, isPresent()).forNoMoreThan(10).seconds();
        numeroItems = the(NUM_CARRITO).answeredBy(actor).getText();
        return numeroItems;
    }

    public static Question<String> itemsCarrito(){
        return new ObtenerItemsCarrito();
    }
}
