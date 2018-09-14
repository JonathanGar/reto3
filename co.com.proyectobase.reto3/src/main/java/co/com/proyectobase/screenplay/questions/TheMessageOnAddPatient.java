package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.AddPatientHospitalsManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessageOnAddPatient implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {		
		return Text.of(AddPatientHospitalsManagement.TXT_MESSAGE).viewedBy(actor).asString();
	}
	
	public static TheMessageOnAddPatient is() {
		return new TheMessageOnAddPatient();
	}

}
