import java.util.Date;

public class AppointmentNurse implements Ischedule {
  private int id;
  private Nurse nurse;
  private Patient patient;
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
  
  @Override
  public void schedule(Date date, String time) {
    // Implementation of the schedule method
    System.out.println("Scheduling appointment for nurse on " + date + " at " + time);
  }
}