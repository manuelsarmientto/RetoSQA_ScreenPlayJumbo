package co.tiendasjumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {
    public static final Target TXT_PRODUCTO = Target.the("Texto del producto")
            .locatedBy("//div[@class='fw6']");
    public static final Target TXT_MARCA = Target.the("Texto de la marca")
            .locatedBy("//div[@class='tiendasjumboqaio-jumbo-minicart-2-x-minicartBrandName']");
}
