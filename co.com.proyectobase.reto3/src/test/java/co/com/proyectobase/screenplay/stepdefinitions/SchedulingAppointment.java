package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.AddPatientHospitalsManagementModel;
import co.com.proyectobase.screenplay.questions.TheMessageOnAddPatient;
import co.com.proyectobase.screenplay.tasks.OpenBrowser;
import co.com.proyectobase.screenplay.tasks.appointments.Schedule;
import co.com.proyectobase.screenplay.tasks.patients.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SchedulingAppointment {
	
	@Managed(driver="Chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void initialConfiguration() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}	

	@Given("^Carlos needs attend to he doctor$")
	public void carlosNeedsAttendToHeDoctor() {
		carlos.wasAbleTo(OpenBrowser.onTheManagementHospitalsPage());
	}
	
	
	@When("^he  performs the scheduling of an appointment$")
	public void hePerformsTheSchedulingOfAnAppointment() {
		carlos.attemptsTo(Schedule.anAppointment());
	}
	
	@Then("^he verifies on the screen the message (.*)$")
	public void heVerifiesOnTheScreenTheMessageDatosGuardadosCorrectamente() {
	}
	
	
}
