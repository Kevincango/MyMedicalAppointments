import java.util.Scanner;
import java.util.ArrayList;

public class UIMenu {

public static final String[] MONTHS = {"Janury", "Febreury", "March", "April", "May", "June", "July", "Agusth", "Septemner", "October", "Nomvember", "December"};
  public static Doctor doctorLogged;
  public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");


            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                response = 0;
                authUser(1);
                    break;
                case 2:
                    response = 0;
                authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

  private static void authUser(int userType) {

     ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    doctors.add(new Doctor("sergio", "sergio@mail.com"));

    ArrayList<Patient> patiens = new ArrayList<Patient>();

    patiens.add(new Patient("otro", "otro@mail.com"));

    Boolean emailCorrect = false;

    do{
      System.out.println("Insert your email");
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();
      if(userType == 1){
        for(Doctor doctor : doctors){
          if(doctor.getEmail().equals(email));
          emailCorrect = true;
          doctorLogged = doctor;
        }
      }
      if(userType == 2){
        for(Patient patient : patiens){
          if(patient.getEmail().equals(email));
          emailCorrect = true;
          patientLogged = patient;
        }
      }
    }while(!emailCorrect);
  }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 0; i < 3; i++){
                        System.out.println(MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}