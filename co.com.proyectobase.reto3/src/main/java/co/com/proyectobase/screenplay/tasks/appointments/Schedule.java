package co.com.proyectobase.screenplay.tasks.appointments;

import java.util.Calendar;
import java.util.List;

import co.com.proyectobase.screenplay.model.ScheduleAppointmentModel;
import co.com.proyectobase.screenplay.ui.AppointmentSchedulingHospitalsManagement;
import co.com.proyectobase.screenplay.ui.HospitalsManagementSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Schedule implements Task {
	
	private List<ScheduleAppointmentModel> scheduleAppointmentModel;
	
	public Schedule(List<ScheduleAppointmentModel> scheduleAppointmentModel) {
		super();
		this.scheduleAppointmentModel = scheduleAppointmentModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {	
		ScheduleAppointmentModel data = this.scheduleAppointmentModel.get(0);
		
		actor.attemptsTo(Click.on(HospitalsManagementSite.LINK_SCHEDULE_APPOINTMENT));
		actor.attemptsTo(Click.on(AppointmentSchedulingHospitalsManagement.INPUT_APPOINTMNET_DAY));		
		
		Calendar now = Calendar.getInstance();
		// obtenemos la fecha de hoy y la del último mes
		int today = now.get(Calendar.DATE);		
		int last_day = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// si estamos en el último día del mes agendamos la cita
		// para el primer día del próximo mes
		if (today == last_day) { 
			actor.attemptsTo(Click.on(AppointmentSchedulingHospitalsManagement.ARROW_NEXT_MONTNH));
			actor.attemptsTo(Click.on(AppointmentSchedulingHospitalsManagement.FIRST_DAY));
		// agendamos la cita para mañana
		} else {
			
			int tomorrow = today + 1;			
			actor.attemptsTo(Click.on(AppointmentSchedulingHospitalsManagement.get_day_target(tomorrow)));
		}
		
		actor.attemptsTo(Enter.theValue(data.getPatients_identity_document()).into(
				AppointmentSchedulingHospitalsManagement.INPUT_PATIENTS_IDENTITY));
		actor.attemptsTo(Enter.theValue(data.getDoctors_identity_document()).into(
				AppointmentSchedulingHospitalsManagement.INPUT_DOCTORS_IDENTITY));
		actor.attemptsTo(Enter.theValue(data.getComments()).into(
				AppointmentSchedulingHospitalsManagement.TEXTAREA_COMMENTS));
		actor.attemptsTo(Click.on(AppointmentSchedulingHospitalsManagement.LINK_SAVE));
	}
	
	public static Schedule anAppointment(List<ScheduleAppointmentModel> scheduleAppointmentModel) {
		return Tasks.instrumented(Schedule.class, scheduleAppointmentModel);
	}

}
