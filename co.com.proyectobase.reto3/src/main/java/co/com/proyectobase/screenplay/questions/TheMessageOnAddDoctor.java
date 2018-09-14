package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.AddDoctorHospitalsManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessageOnAddDoctor implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {		
		return Text.of(AddDoctorHospitalsManagement.TXT_MESSAGE).viewedBy(actor).asString();
	}
	
	public static TheMessageOnAddDoctor is() {
		return new TheMessageOnAddDoctor();
	}

}
