package co.com.proyectobase.screenplay.model;

public class ScheduleAppointmentModel {
	
	private String patients_identity_document;
	private String doctors_identity_document;
	private String comments;
	
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
