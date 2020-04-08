package com.eltiempo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://beta.eltiempo.com/")
public class InicioElTiempoPage extends PageObject{

	public static final Target ACEPTAR_ALERTAS = Target.the("Boton Aceptar").located(By.id("onesignal-popover-container"));
	
	public static final Target INGRESAR_INICIO_SESION = Target.the("Boton Iniciar Sesion").locatedBy("//a[@href='/login']");
}
