package com.eltiempo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://beta.eltiempo.com/")
public class InicioElTiempoPage extends PageObject {

	public static final Target ACEPTAR_ALERTAS = Target.the("Boton Aceptar").located(By.id("onesignal-popover-container"));
	
	public static final Target INGRESAR_INICIO_SESION = Target.the("Boton Iniciar Sesion").locatedBy("//a[@href='/login']");
	
	public static final  Target POPUP = Target.the("BOTON POPUP").located(By.id("onesignal-popover-container"));
}

