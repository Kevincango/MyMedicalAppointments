import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat; 
import java.text.ParseException;

public class Doctor extends User {
  private String speciality;

  public Doctor(String name, String speciality){
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

  @Override
  public void showDataUser(){
    System.out.println("Doctor's data: ");
  }

  ArrayList<Doctor.AvailableAppointment> availableAppointments = new ArrayList<Doctor.AvailableAppointment>();
  
  public void addAvailableAppointments(String date, String time){
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
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public AvailableAppointment(String date, String time){
      try{
        this.date = format.parse(date);
        
      }catch(ParseException e){
        e.printStackTrace();
      }
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

    public String getDate(String DATE){
      return format.format(date);
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