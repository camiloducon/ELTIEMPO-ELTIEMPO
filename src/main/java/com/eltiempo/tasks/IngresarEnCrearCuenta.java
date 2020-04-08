package com.eltiempo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.eltiempo.userinterfaces.IniciarSesionPage;

public class IngresarEnCrearCuenta implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IniciarSesionPage.INGRESAR_CREAR_CUENTA));
		
	}

	public static IngresarEnCrearCuenta y() {

		return instrumented(IngresarEnCrearCuenta.class);
	}

}
