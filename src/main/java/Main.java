// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Doctor myDoctor = new Doctor("kevin", "Neuroscientiest");
    myDoctor.addAvailableAppointments(new Date(), "12:00");
    myDoctor.addAvailableAppointments(new Date(), "13:00");
    myDoctor.addAvailableAppointments(new Date(), "14:00");

    for(Doctor.AvailableAppointment appointment : myDoctor.getAvailableAppointments()){
      System.out.println(appointment.getDate() + " " + appointment.getTime());
    }

    Patient myPatient = new Patient("mar", "mar@gmail.com");
      System.out.println(myPatient.getName());
      System.out.println(myPatient.getEmail());
      myPatient.setHeight(1.80);
      System.out.println(myPatient.getHeight());

    
  }

}