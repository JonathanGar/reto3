package co.com.proyectobase.screenplay.tasks.appointments;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Schedule implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {	
	}
	
	public static Schedule anAppointment() {
		return Tasks.instrumented(Schedule.class);
	}

}
