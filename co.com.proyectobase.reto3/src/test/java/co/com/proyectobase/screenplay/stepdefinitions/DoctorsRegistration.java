package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.AddDoctorHospitalsManagementModel;
import co.com.proyectobase.screenplay.questions.TheMessageOnAddDoctor;
import co.com.proyectobase.screenplay.tasks.OpenBrowser;
import co.com.proyectobase.screenplay.tasks.doctors.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DoctorsRegistration {
	
	@Managed(driver="Chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void initialConfiguration() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Carlos needs registrate a new doctor$")
	public void carlosNeedsRegistrateANewDoctor() {
		carlos.wasAbleTo(OpenBrowser.onTheManagementHospitalsPage());
	}


	@When("^he performs the register of the same on the hospitals administration application$")
	public void hePerformsTheRegisterOfTheSameOnTheHospitalsAdministrationApplication(List<AddDoctorHospitalsManagementModel> addDoctorHospitalsManagementModel) {
		carlos.attemptsTo(Register.aNewDoctorOnTheHospitalsAdministrationApplication(addDoctorHospitalsManagementModel));
	}

	@Then("^he verifies that its shown on the screen the message (.*)$")
	public void heVerifiesThatItsShownOnTheScreenTheMessageDatosGuardadosCorrectamente(String question) {	    
		carlos.should(seeThat(TheMessageOnAddDoctor.is(), equalTo(question)));		
	}


}
