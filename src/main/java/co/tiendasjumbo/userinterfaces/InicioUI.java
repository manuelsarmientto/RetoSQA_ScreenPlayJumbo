package co.tiendasjumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static final Target CAMPO_BUSCAR = Target.the("Campo busqueda producto")
            .locatedBy("//input[@placeholder='¿Qué estás buscando?']");

    public static final Target BTN_BUSCAR = Target.the("Boton busqueda producto")
            .locatedBy("//div[@class='vtex-store-components-3-x-suffixWrapper vtex-store-components-3-x-suffixWrapper--main-search flex h-100']");

    public static final Target BTN_CARRITO = Target.the("Boton carrito de compras")
            .locatedBy("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action icon-button dib bg-transparent b--transparent c-action-primary hover-b--transparent hover-bg-action-secondary hover-b--action-secondary pointer ']");

    public static final Target NUM_CARRITO = Target.the("# de items en el carrito").locatedBy("//span[@class='vtex-minicart-2-x-minicartQuantityBadge vtex-minicart-2-x-minicartQuantityBadge--minicart-desktop vtex-minicart-2-x-minicartQuantityBadgeDefault c-on-emphasis absolute t-mini bg-emphasis br4 w1 h1 pa1 flex justify-center items-center lh-solid']");

}

