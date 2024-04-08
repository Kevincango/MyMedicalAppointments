import java.util.Date;

public class AppointmentDoctor implements Ischedule {
  private int id;
  private Patient patient;
  private Doctor doctor;
  private Date date;
  private String time;

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public Patient getPatient(){
    return patient;
  }

  public void setPatient(Patient patient){
    this.patient = patient;
  }

  public Date getDate(){
    return date;
  }
  public void setDate(Date date){
    this.date = date;
  }
  public void addAvailableAppointments(Date date, String time){
    System.out.println("Adding appointment to doctor " + date + " " + time);
  }
  @Override
  public void schedule(String date, String time) {
      System.out.println("Scheduling appointment for doctor on " + date + " at " + time);
  }

}