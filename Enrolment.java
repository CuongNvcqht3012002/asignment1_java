package a1_2001040022;

public class Enrolment {
  private Student student;
  private Module module;
  private Double internalMark;
  private Double examinationMark;
  private char finalGrade;

  public Enrolment(Student student, Module module, Double internalMark, Double examinationMark) {
    this.student = student;
    this.module = module;
    this.internalMark = internalMark;
    this.examinationMark = examinationMark;
  }

  public Student getStudent() {
    return this.student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Module getModule() {
    return this.module;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public Double getInternalMark() {
    return this.internalMark;
  }

  public void setInternalMark(Double internalMark) {
    this.internalMark = internalMark;
  }

  public Double getExaminationMark() {
    return this.examinationMark;
  }

  public void setExaminationMark(Double examinationMark) {
    this.examinationMark = examinationMark;
  }

  public char getFinalGrade() {
    return this.finalGrade;
  }

  public Boolean isEqualStudent(Student student) {
    return this.student.getId() == student.getId();
  }

  public Boolean isEqualModule(Module module) {
    return this.module.getCode() == module.getCode();
  }
}
