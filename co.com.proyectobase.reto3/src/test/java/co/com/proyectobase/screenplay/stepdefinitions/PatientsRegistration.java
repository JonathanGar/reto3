package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.AddPatientHospitalsManagementModel;
import co.com.proyectobase.screenplay.questions.TheMessageOnAddPatient;
import co.com.proyectobase.screenplay.tasks.OpenBrowser;
import co.com.proyectobase.screenplay.tasks.patients.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PatientsRegistration {
	
	@Managed(driver="Chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void initialConfiguration() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Carlos needs registrate a new patient$")
	public void carlosNeedsRegistrateANewPatient() {
		carlos.wasAbleTo(OpenBrowser.onTheManagementHospitalsPage());
	}


	@When("^he perfomrs the registration of the same on the hospitals administration application$")
	public void hePerfomrsTheRegistrationOfTheSameOnTheHospitalsAdministrationApplication(List<AddPatientHospitalsManagementModel> addPatientHospitalsManagementModel) {
		carlos.attemptsTo(Register.aNewPatientOnTheHospitalsAdministrationApplication(addPatientHospitalsManagementModel));
	}

	@Then("^he verifies that its shown on the screen th message (.*)$")
	public void heVerifiesThatItsShownOnTheScreenThMessageDatosGuardadosCorrectamente(String question) {
		carlos.should(seeThat(TheMessageOnAddPatient.is(), equalTo(question)));
	}

}
