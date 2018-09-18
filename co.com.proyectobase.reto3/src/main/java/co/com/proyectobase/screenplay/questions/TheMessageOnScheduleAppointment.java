package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.AppointmentSchedulingHospitalsManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessageOnScheduleAppointment implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {		
		return Text.of(AppointmentSchedulingHospitalsManagement.TXT_SUCCESS_MESSAGE).viewedBy(
				actor).asString();
	}
	
	public static TheMessageOnScheduleAppointment is() {
		return new TheMessageOnScheduleAppointment();
	}

}
