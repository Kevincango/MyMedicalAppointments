import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
  private String birthday;
  private double weight;
  private double height;
  private String blood;

  private ArrayList<AppointmentDoctor> appointmentsDoctor = new ArrayList<AppointmentDoctor>();

  private ArrayList<AppointmentNurse> appointmentNurse = new ArrayList<AppointmentNurse>();

  public void addAppointmentDoctors(Doctor doctor, Date date, String time){
    AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
    appointmentDoctor.schedule(date, time);
    appointmentsDoctor.add(appointmentDoctor);
  }

  public ArrayList<AppointmentDoctor> getAppointmentDoctors(){
    return appointmentsDoctor;
  }

  public Patient(String name, String email){
    super(name, email);
    
  }

  public void setWeigth(double weight){
    this.weight = weight;
  }

  public String getWeigth(){
    return this.weight + " kg";
  }

  public void setHeight(double height){
    this.height = height;
  }

  public String getHeight(){
    return this.height + " cm";
  }

  public void setBlood(String blood){
    this.blood = blood;
  }

  public String getBlood(){
    return this.blood;
  }

  public void setBirthday(String birthday){
    this.birthday = birthday;
  }

  public String getBirthday(){
    return this.birthday;
  }

  public String toString(){
    return super.toString() + "\nBirthday: " + this.birthday + "\nWeight: " + this.weight
      + "\nHeight: " + this.height + "\nBlood: " + this.blood;
  }

  @Override
  public void showDataUser(){
    System.out.println("Patient's data: ");
  }
}