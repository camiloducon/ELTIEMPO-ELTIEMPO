package com.eltiempo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage extends PageObject{
	
	public static final Target INGRESAR_CREAR_CUENTA = Target.the("Boton Ingresar Crear Cuenta").locatedBy("//a[contains(text(),'O crea una cuenta')]");

}
