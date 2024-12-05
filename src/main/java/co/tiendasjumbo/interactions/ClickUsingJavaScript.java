package co.tiendasjumbo.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.targets.Target;

public class ClickUsingJavaScript implements Task {

    private Target target;

    public ClickUsingJavaScript(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtén el WebDriver del actor
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Crea el objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Ejecuta el clic en el elemento especificado por el XPath
        String xpath = target.getCssOrXPathSelector(); // Extrae el XPath del Target
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
    }

    // Método estático para crear una instancia del Task con el Target recibido
    public static ClickUsingJavaScript withTarget(Target target) {
        return new ClickUsingJavaScript(target);
    }
}

