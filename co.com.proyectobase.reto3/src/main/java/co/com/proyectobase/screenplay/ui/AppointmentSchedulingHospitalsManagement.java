package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AppointmentSchedulingHospitalsManagement extends PageObject {
	public static final Target INPUT_APPOINTMNET_DAY = Target.the(
			"Appointment day input").located(By.xpath("//*[@id=\"datepicker\"]"));
	public static final Target ARROW_NEXT_MONTNH = Target.the(
			"Next month arrow").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
	public static final Target FIRST_DAY = Target.the(
			"Calendar day first of the next month").located(By.xpath("//A[@class='ui-state-default'][text()='1']"));
	public static final Target INPUT_PATIENTS_IDENTITY = Target.the(
			"Patient's identity document").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input"));
	public static final Target INPUT_DOCTORS_IDENTITY = Target.the(
			"Doctor's identity document").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input"));
	public static final Target TEXTAREA_COMMENTS = Target.the(
			"Comments textarea").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea"));
	public static final Target LINK_SAVE = Target.the(
			"Save link").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
	public static final Target TXT_SUCCESS_MESSAGE = Target.the(
			"Success message text").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
	
	public static Target get_day_target(int day) {		
		return Target.the("Calendar tomorrow day").located(By.xpath(
				"//A[@class='ui-state-default'][text()='"+ day +"']"));						
	} 
}
