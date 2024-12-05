package co.tiendasjumbo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DatosEnvioUI {
    public static final Target CAMPO_CORREO = Target.the("Campo para ingresar el correo")
            .locatedBy("//input[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']");
    public static final Target BTN_ENVIAR = Target.the("Boton para enviar correo ingresado")
            .locatedBy("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 ']");
    public static final Target SELECT_DEPARTAMENTO = Target.the("Seleccionar departamento")
            .locatedBy("(//div[@class='css-1j9dihh-control'])[1]");
    public static final Target SELECT_CIUDAD = Target.the("Seleccionar ciudad")
            .locatedBy("//div[contains(text(),'Ciudad')]");
    public static final Target CAMPO_DIRECCION = Target.the("Campo para ingresar direccion")
            .locatedBy("//input[@placeholder='Ingresa tu dirección']");
    public static final Target CAMPO_COMPLEMENTO_DIRECCION = Target.the("Campo para ingresar complemento de la direccion")
            .locatedBy("//input[@placeholder='Piso, Apartamento, Edificio']");
    public static final Target BTN_CONFIRMAR = Target.the("Boton para confirmar datos ingresados")
            .locatedBy("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 ']");
}
