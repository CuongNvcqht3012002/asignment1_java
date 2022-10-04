package a1_2001040022;

public class ElectiveModule extends Module {
  public String departmentName;

  public ElectiveModule(String name, int semester, int credits, String departmentName) {
    super(name, semester, credits);
    this.departmentName = departmentName;
  }
}
