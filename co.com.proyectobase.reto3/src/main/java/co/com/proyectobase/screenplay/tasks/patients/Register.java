package co.com.proyectobase.screenplay.tasks.patients;

import java.util.List;

import co.com.proyectobase.screenplay.model.AddPatientHospitalsManagementModel;
import co.com.proyectobase.screenplay.ui.AddPatientHospitalsManagement;
import co.com.proyectobase.screenplay.ui.HospitalsManagementSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.Task;

public class Register implements Task {
	
	private List<AddPatientHospitalsManagementModel> addPatientHospitalsManagementModel;
	
	public Register(List<AddPatientHospitalsManagementModel> addPatientHospitalsManagementModel) {
		super();
		this.addPatientHospitalsManagementModel = addPatientHospitalsManagementModel;
	}

	@Override	
	public <T extends Actor> void performAs(T actor) {
		AddPatientHospitalsManagementModel addPatientRaw = addPatientHospitalsManagementModel.get(0);
		
		actor.attemptsTo(Click.on(HospitalsManagementSite.LINK_ADD_PATIENT));
		
		actor.attemptsTo(Enter.theValue(addPatientRaw.getFull_name()).into(
				AddPatientHospitalsManagement.INPUT_FULLNAME));
		actor.attemptsTo(Enter.theValue(addPatientRaw.getLast_name()).into(
				AddPatientHospitalsManagement.INPUT_LAST_NAME));
		actor.attemptsTo(Enter.theValue(addPatientRaw.getPhone_number()).into(
				AddPatientHospitalsManagement.INPUT_PHONE_NUMBER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(
				addPatientRaw.getDocument_type()).from(AddPatientHospitalsManagement.SELECT_DOCUMENT_TYPE));
		actor.attemptsTo(Enter.theValue(addPatientRaw.getDocument()).into(AddPatientHospitalsManagement.INPUT_DOCUMENT));
		actor.attemptsTo(Click.on(AddPatientHospitalsManagement.CHECKBOX_PREPAID_HEALTH));
		
		actor.attemptsTo(Click.on(AddPatientHospitalsManagement.BTN_SAVE));
	}
	
	public static Register aNewPatientOnTheHospitalsAdministrationApplication(List<AddPatientHospitalsManagementModel> addPatientHospitalsManagementModel) {		 
		return Tasks.instrumented(Register.class, addPatientHospitalsManagementModel);
	}
	
	

}
