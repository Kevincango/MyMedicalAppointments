public class Nurse extends User {
  private String speciality;

  public Nurse(String name, String email){
    super(name, email);
  }

  public String getSpecialty(){
    return speciality;
  }
  public void setSpecialty(String speciality){
    this.speciality = speciality;
  }
}