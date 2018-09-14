package co.com.proyectobase.screenplay.tasks.doctors;

import java.util.List;

import co.com.proyectobase.screenplay.model.AddDoctorHospitalsManagementModel;
import co.com.proyectobase.screenplay.ui.AddDoctorHospitalsManagement;
import co.com.proyectobase.screenplay.ui.HospitalsManagementSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.WithTag;
import net.serenitybdd.screenplay.Task;

public class Register implements Task {
	
	private List<AddDoctorHospitalsManagementModel> addDoctorHospitalsManagementModel;
	
	public Register(List<AddDoctorHospitalsManagementModel> addDoctorHospitalsManagementModel) {
		super();
		this.addDoctorHospitalsManagementModel = addDoctorHospitalsManagementModel;
	}

	@Override	
	@WithTag("tag1")
	public <T extends Actor> void performAs(T actor) {
		AddDoctorHospitalsManagementModel addDoctorRaw = addDoctorHospitalsManagementModel.get(0);
		
		actor.attemptsTo(Click.on(HospitalsManagementSite.LINK_ADD_DOCTOR));
		actor.attemptsTo(Enter.theValue(addDoctorRaw.getFull_name()).into(
				AddDoctorHospitalsManagement.INPUT_FULLNAME));
		actor.attemptsTo(Enter.theValue(addDoctorRaw.getLast_name()).into(
				AddDoctorHospitalsManagement.INPUT_LAST_NAME));
		actor.attemptsTo(Enter.theValue(addDoctorRaw.getPhone_number()).into(
				AddDoctorHospitalsManagement.INPUT_PHONE_NUMBER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(
				addDoctorRaw.getDocument_type()).from(AddDoctorHospitalsManagement.SELECT_DOCUMENT_TYPE));
		actor.attemptsTo(Enter.theValue(addDoctorRaw.getDocument()).into(AddDoctorHospitalsManagement.INPUT_DOCUMENT));		
		
		actor.attemptsTo(Click.on(AddDoctorHospitalsManagement.BTN_SAVE));
	}
	
	public static Register aNewDoctorOnTheHospitalsAdministrationApplication(List<AddDoctorHospitalsManagementModel> addDoctorHospitalsManagementModel) {		 
		return Tasks.instrumented(Register.class, addDoctorHospitalsManagementModel);
	}
	
	

}
