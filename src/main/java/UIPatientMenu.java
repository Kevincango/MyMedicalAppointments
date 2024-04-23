import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class UIPatientMenu {

  public static void showPatientMenu(){
    int response = 0;

    do{
      System.out.println("\n\n");
      System.out.println("Patient");
      System.out.println("Welcome: " + UIMenu.patientLogged);
      System.out.println("1. Book an appointment");
      System.out.println("2. My appointments");
      System.out.println("0. Return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch(response){
        case 1:
          UIMenu.showPatientMenu();
          break;
        case 2:
          showMyAppointments();
          break;
        case 0:
          UIMenu.showMenu();
          break;
      }
    }while(response != 0);
  }

  private static void showBookAppointments(){
    int response = 0;
    do{
      System.out.println(":: Book an appointment ::");
      System.out.println("1. Select a date");
      //dates list
      Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<Integer, Map<Integer, Doctor>>();
      int k = 0;
      for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size() ; i++){
        ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
        Map<Integer, Doctor> doctorAppointments = new TreeMap<Integer, Doctor>();

        for(int j = 0; j < availableAppointments.size(); j++){
          k++;
          System.out.println(k + " " +  availableAppointments.get(j).getDate());
        
          doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));


          doctors.put(Integer.valueOf(k), doctorAppointments);
        }
      }
      Scanner sc = new Scanner(System.in);
      int responseDateSelected = Integer.valueOf(sc.nextLine());
      Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
      Integer indexDate = 0;
      Doctor doctorSelected = new Doctor("", "");
      for(Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()){
        indexDate = doc.getKey();
        doctorSelected = doc.getValue();
      }
      System.out.println("Doctor: " + doctorSelected.getName() + ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime() + " Date : " +
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate());

      System.out.println("1.- confirm your appointment \n1. Yes \n2. Change Date");
      response = Integer.valueOf(sc.nextLine());

      if(response == 1){
        UIMenu.patientLogged.addAppointmentDoctors(
doctorSelected,           doctorSelected.getAvailableAppointments().get(indexDate).getDate(),
doctorSelected.getAvailableAppointments().get(indexDate).getTime());
      }
      
    }while(response != 0);
  }

  private static void showMyAppointments(){
    int response = 0;
    do{
      System.out.println("");
      if(UIMenu.patientLogged.getAppointmentDoctors().size()== 0){
        break;
      }

      for(int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++){
        System.out.println(" " + " " + 
                          UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() + " " +
                          UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime());
      }
    }while(response != 0);
  }
}