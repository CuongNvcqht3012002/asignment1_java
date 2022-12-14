package a1_2001040022;

public class Module {
  private String code;
  private String name;
  private int semester;
  private int credits;
  private static int theTotalOfModule = 0;

  public Module(String name, int semester, int credits) {
    this.name = name;
    this.semester = semester;
    this.credits = credits;

    this.code = "M" + this.semester * 100 + ++theTotalOfModule;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSemester() {
    return semester;
  }
  public void setSemester(int semester) {
    this.semester = semester;
  }
  public int getCredits() {
    return credits;
  }
  public void setCredits(int credits) {
    this.credits = credits;
  }
}
