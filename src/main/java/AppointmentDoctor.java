import java.util.Date;

public class AppointmentDoctor implements Ischedule {
  public void addAvailableAppointments(Date date, String time){
    System.out.println("Adding appointment to doctor " + date + " " + time);
    
  }
}