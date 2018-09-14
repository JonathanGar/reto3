package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class AddPatientHospitalsManagement extends PageObject{
	public static final Target INPUT_FULLNAME = Target.the(
			"Full name input").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[1]/input"));	
	public static final Target INPUT_LAST_NAME = Target.the(
			"Lastname input").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input"));
	public static final Target INPUT_PHONE_NUMBER = Target.the(
			"Phone number input").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input"));
	public static final Target SELECT_DOCUMENT_TYPE = Target.the(
			"Document type select").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select"));
	public static final Target INPUT_DOCUMENT = Target.the(
			"Identity document input").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[5]/input"));
	public static final Target CHECKBOX_PREPAID_HEALTH = Target.the(
			"Checkbox prepaid health").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label/input"));	
	public static final Target BTN_SAVE = Target.the(
			"Save button").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
	public static final Target TXT_MESSAGE = Target.the(
			"Success message text").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
	
}
