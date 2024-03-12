import java.util.Date;
import java.util.ArrayList;

public class Doctor extends User {
  private String speciality;

  Doctor(String name, String speciality){
    super(name, speciality);
    System.out.println("The name of the doctor is " + name);
    this.speciality = speciality;
  }

  public String getSpeciality(){
    return speciality;
  }
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }

  ArrayList<Doctor.AvailableAppointment> availableAppointments = new ArrayList<Doctor.AvailableAppointment>();
  
  public void addAvailableAppointments(Date date, String time){
    availableAppointments.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }

  public String toString(){
    return super.toString() + "\nSpeciality: " + this.speciality + "\nAvailable appointments: " + availableAppointments.toString();
  }

  public static class AvailableAppointment {
    private int id;
    private Date date;
    private String time;

    public AvailableAppointment(Date date, String time){
      this.date = date;
      this.time = time;
    }

    public int getId(){
      return id;
    }
    public void setId(int id){
      this.id = id;
    }

    public Date getDate(){
      return this.date;
    }

    public void setDate(Date date){
      this.date = date;
    }
    
    public String getTime(){
      return this.time;
    }

    public void setTime(String time){
      this.time = time;
    }

    public String toString(){
      return "Available appointments \nDate: " + this.date + "\nTime: " + this.time;
    }
  }
}