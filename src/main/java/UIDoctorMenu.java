
import java.util.Scanner;

public class UIDoctorMenu {

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
        System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected]);

        System.out.println("select the available date : [dd/mm/yyyy]");
        String date = sc.nextLine();

        System.out.println("Your date is " + date + "\n1. Confirm\n2. Cancel");

      }else if(response == 0){
        showDoctorMenu();
      }
    }while(response != 0);
  }
}