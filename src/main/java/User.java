public abstract class User {
  private int id;
  private String name;
  private String email;
  private String address;
  private String phoneNumber;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }

  public String getAddress(){
    return address;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public void setPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() > 8) {
      System.out.println("Phone number is too long");
    } else {
      this.phoneNumber = phoneNumber;
    }
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public String toString(){
    return "Name: " + this.name + "\nEmail: " + this.email + "\nAddress: " + this.address + "\nPhone number: " + this.phoneNumber;
  }

  public abstract void showDataUser();

}