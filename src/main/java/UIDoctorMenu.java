
import java.util.Scanner;
import java.util.ArrayList;

public class UIDoctorMenu {

  public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<Doctor>();

  public static void showDoctorMenu(){
    int response = 0;
    do{
    System.out.println("\n\n");
    System.out.println("Doctor");
    System.out.println("Welcome " + UIMenu.doctorLogged.getName());
    System.out.println("1. Add Available Appointment");
    System.out.println("2. My scheduled appointments");
    System.out.println("0. Logout");

    Scanner sc = new Scanner(System.in);
    response = Integer.valueOf(sc.nextLine());

    switch(response){
      case 1:
        showAddAvailableAppointment();
        break;
      case 2:
        break;
      case 0:
        UIMenu.showMenu();
        break;
    }
    }while(response != 0);
  }

  private static void showAddAvailableAppointment(){
    int response = 0;
    do{
      System.out.println("\n\n");
      System.out.println(":: Add Available Appointment ::");
      System.out.println(":: Select a month");

      for(int i = 0; i < 3; i++){
        int j = i + 1;
        System.out.println(j + ". " + UIMenu.MONTHS[i]);
      }

      System.out.println("0. Return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      if(response > 0 && response < 4){
        int monthSelected = response;
        System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected - 1]);

        System.out.println("select the available date : [dd/mm/yyyy]");
        String date = sc.nextLine();

        System.out.println("Your date is " + date + "\n1. Confirm\n2. Cancel");
        int responseDate = Integer.valueOf(sc.nextLine());

        if(responseDate == 2) continue;

        int responseTime = 0;
        String time = "";
        do{
          System.out.println("Insert the time available for date " + date + "[16:00] ");
          time = sc.nextLine();
          System.out.print("Your time is " + time + "\n1. Confirm\n2. Cancel");
          responseTime = Integer.valueOf(sc.nextLine());
        }while(responseTime == 2);

        UIMenu.doctorLogged.addAvailableAppointments(date, time);
        checkDoctorAvaliableAppointments(UIMenu.doctorLogged);

      }else if(response == 0){
        showDoctorMenu();
      }
    }while(response != 0);
  }

  private static void checkDoctorAvaliableAppointments(Doctor doctor){
    if(doctor.getAvailableAppointments().size() == 0 && !doctorsAvailableAppointments.contains(doctor)){
      doctorsAvailableAppointments.add(doctor);
    }
  }
}