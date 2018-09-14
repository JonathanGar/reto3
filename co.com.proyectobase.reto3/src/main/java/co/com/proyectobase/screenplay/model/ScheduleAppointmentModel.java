package co.com.proyectobase.screenplay.model;

public class ScheduleAppointmentModel {
	
	private String appointment_day;
	private String patients_identity_document;
	private String doctors_identity_document;
	private String comments;
	
	public String getAppointment_day() {
		return appointment_day;
	}
	public void setAppointment_day(String appointment_day) {
		this.appointment_day = appointment_day;
	}
	public String getPatients_identity_document() {
		return patients_identity_document;
	}
	public void setPatients_identity_document(String patients_identity_document) {
		this.patients_identity_document = patients_identity_document;
	}
	public String getDoctors_identity_document() {
		return doctors_identity_document;
	}
	public void setDoctors_identity_document(String doctors_identity_document) {
		this.doctors_identity_document = doctors_identity_document;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}		
}
