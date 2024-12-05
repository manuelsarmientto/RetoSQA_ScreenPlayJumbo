package co.tiendasjumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoBusquedaUI {
    public static final Target ITEM_MARCA = Target.the("Opcion expandir marcas")
            .locatedBy("(//span[contains(text(),'Marca')])[2]");
    public static Target CHECK_MARCA(String Marca){
        return Target.the("Checkbox para seleccionar marca")
                .locatedBy("(//label[contains(text(),'"+ Marca +"')])[2]");
    }
    public static final Target BTN_CERRAR = Target.the("Boton para cerrar un popup")
            .locatedBy("//span[@class='tiendasjumboqaio-delivery-modal-3-x-locationVerificationAd__close']");
}
