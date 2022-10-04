package a1_2001040022;

public class Student {
  private String id;
  private String name;
  private String dob;
  private String email;
  private String address;
  private static int theTotalOfStudent = 0;

  public Student(String name, String dob, String email, String address) {
    this.name = name;
    this.dob = dob;
    this.email = email;
    this.address = address;

    this.id = "S" + ++theTotalOfStudent;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
