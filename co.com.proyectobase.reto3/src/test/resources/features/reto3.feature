#Author: your.email@your.domain.com
#Keywords Summary :
# Autor: Jonathan García Escudero

@regression
Feature: Manage medical appointment
  As a patient
  I want to perform the request of a medical appointment 
  Through of the hospitals administration system   
	
  @tag1
  Scenario: Perform a doctor's registration  	
    Given Carlos needs registrate a new doctor
    When he performs the register of the same on the hospitals administration application
    | full_name | last_name       | phone_number | document_type        | document   |
    | Jonathan  | García Escudero	| 3148738997   | Pasaportes           | 1036609979 |
    Then he verifies that its shown on the screen the message Datos guardados correctamente.
  
  @tag2
  Scenario: Perform a patient's registration
  	Given Carlos needs registrate a new patient
  	When he perfomrs the registration of the same on the hospitals administration application
  	| full_name | last_name       | phone_number | document_type        | document   |
    | Jonathan  | García Escudero	| 3148738997   | Pasaportes           | 1036609978 |
  	Then he verifies that its shown on the screen th message Datos guardados correctamente.
 
 	@tag3
 	Scenario: Perform the scheduling of an appointment
 		Given Carlos needs attend to he doctor
 		When he  performs the scheduling of an appointment
 		| appointment_day | patients_identity_document | doctors_identity_document | comments    |
 		| 08/01/2018      | 11111									 	   | 22222                     | cita médica |
 		Then he verifies on the screen the message Datos guardados correctamente. 
 