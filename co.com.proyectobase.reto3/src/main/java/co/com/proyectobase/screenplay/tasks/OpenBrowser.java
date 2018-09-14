package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.HospitalsManagementSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {
	
	private HospitalsManagementSite hospitalsManagementSite;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(hospitalsManagementSite));		
	}

	public static OpenBrowser onTheManagementHospitalsPage() {
		return Tasks.instrumented(OpenBrowser.class);
	}

}
