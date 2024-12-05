package co.tiendasjumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoFiltradoUI {
    public static final Target BTN_AGREGAR = Target.the("Boton para agregar producto")
            .locatedBy("//div[@class='vtex-rich-text-0-x-wrapper vtex-rich-text-0-x-wrapper--btn-trigger vtex-rich-text-0-x-wrapper--btn-trigger-location']");
    public static final Target BTN_CERRAR = Target.the("Boton para cerrar un popup")
            .locatedBy("//span[@class='tiendasjumboqaio-delivery-modal-3-x-locationVerificationAd__close']");
}
