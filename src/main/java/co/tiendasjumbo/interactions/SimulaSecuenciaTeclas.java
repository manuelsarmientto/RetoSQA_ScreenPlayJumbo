package co.tiendasjumbo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SimulaSecuenciaTeclas implements Task {

    private final String texto;

    public SimulaSecuenciaTeclas(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        new Actions(driver)
                .sendKeys(texto)
                .perform();
    }

    public static SimulaSecuenciaTeclas conTexto(String texto) {
        return new SimulaSecuenciaTeclas(texto);
    }
}
