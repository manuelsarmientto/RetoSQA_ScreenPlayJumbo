package co.tiendasjumbo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PresionarEnter implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        new Actions(driver).sendKeys(Keys.ENTER).perform();
    }

    public static PresionarEnter ahora() {
        return new PresionarEnter();
    }
}

