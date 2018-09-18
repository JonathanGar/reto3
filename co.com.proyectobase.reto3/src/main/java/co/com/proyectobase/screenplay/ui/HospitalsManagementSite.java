package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HospitalsManagementSite extends PageObject {	
	public static final Target LINK_ADD_DOCTOR = Target.the(
			"The add doctor link").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
	public static final Target LINK_ADD_PATIENT = Target.the(
			"The add patient link").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
	public static final Target LINK_SCHEDULE_APPOINTMENT = Target.the(
			"Schedule appointment link").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
	
	
}
