package com.eltiempo.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/CrearCuenta.feature",
		glue = "com.eltiempo.stepsDefinition",
        snippets = SnippetType.CAMELCASE
		)
public class CrearCuentaRunner {

}
