package com.eltiempo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage extends PageObject{
	
	public static final Target INGRESAR_CREAR_CUENTA = Target.the("Boton Ingresar Crear Cuenta").locatedBy("//a[contains(text(),'O crea una cuenta')]");
	public static final Target INGRESAR_CORREO_ELECTRONICO = Target.the("Ingresar Correo Electronico").located(By.id("username"));
	public static final Target INGRESAR_CONTRASEÑA = Target.the("Ingresar Contraseña").located(By.id("password"));
	public static final Target BOTON_INICIAR_SESION = Target.the("Boton Iniciar Sesion").located(By.id("submitbutton"));

}
