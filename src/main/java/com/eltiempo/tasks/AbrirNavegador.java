package com.eltiempo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.eltiempo.userinterfaces.InicioElTiempoPage;;

public class AbrirNavegador implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new InicioElTiempoPage()));
		
	}

	public static AbrirNavegador en() {
		return instrumented(AbrirNavegador.class);
	}

}
