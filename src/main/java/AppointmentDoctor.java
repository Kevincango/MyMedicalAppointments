import java.util.Date;

public class AppointmentDoctor implements Ischedule {
  private int id;
  private Patient patient;
  private Doctor doctor;
  private Date date;
  private String time;

  public AppointmentDoctor(Patient patient, Doctor doctor){
    this.patient = patient;
    this.doctor = doctor;
  }

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

  public String getTime(){
    return time + " hrs";
  }
 
  @Override
  public void schedule(Date date, String time) {
    // Implement the scheduling logic here
    this.date = date;
    this.time = time;
  }

}