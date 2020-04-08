package com.eltiempo.stepsDefinition;

import org.openqa.selenium.WebDriver;

import com.eltiempo.tasks.AbrirNavegador;
import com.eltiempo.tasks.IngresarEnCrearCuenta;
import com.eltiempo.tasks.IngresarEnIniciarSesion;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CrearCuentaStepsDefinition {


	@Managed(driver = "chrome")
	private WebDriver hisBrowser; //hisBrowser
	
	private Actor rene = Actor.named("Rene");
	
	
	@Before
	public void conectarDriverConActor() {
		rene.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Rene requiere crear una cuenta en ELTIEMPO (\\d+)$")
	public void queReneRequiereCrearUnaCuentaEnELTIEMPO(int arg1, DataTable arg2) throws Exception {
		rene.wasAbleTo(AbrirNavegador.en());
		rene.wasAbleTo(IngresarEnIniciarSesion.para());
		rene.wasAbleTo(IngresarEnCrearCuenta.y());
	}


	@Cuando("^completa el formulario$")
	public void completaElFormulario() throws Exception {

	}

	@Entonces("^ve como resultado la creacion de su cuenta$")
	public void veComoResultadoLaCreacionDeSuCuenta() throws Exception {

	}
}
