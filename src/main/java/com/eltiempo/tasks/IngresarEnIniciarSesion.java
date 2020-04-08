package com.eltiempo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.eltiempo.userinterfaces.InicioElTiempoPage;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Bottom;

public class IngresarEnIniciarSesion implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.asksFor(question)
		actor.attemptsTo(Click.on(InicioElTiempoPage.INGRESAR_INICIO_SESION));
		
	}

	public static IngresarEnIniciarSesion para() {
		
		return instrumented(IngresarEnIniciarSesion.class);
	}

}
