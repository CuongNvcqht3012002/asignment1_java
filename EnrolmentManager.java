package a1_2001040022;

import java.util.ArrayList;

public class EnrolmentManager {
  public ArrayList<Enrolment> enrollments = new ArrayList<Enrolment>();

  public void addEnrolment(Enrolment enrolment) {
    enrollments.add(enrolment);
  }

  public Enrolment getEnrolment(Student student, Module module) {
    for (Enrolment enrolment : enrollments) {
      if (enrolment.isEqualStudent(student) && enrolment.isEqualModule(module)) {
        return enrolment;
      }
    }
    return null;
  }

  public void setMarks(Student student, Module module, double internalMark, double examinationMark) {
    Enrolment enrolment = getEnrolment(student, module);
    if (enrolment != null) {
      enrolment.setInternalMark(internalMark);
      enrolment.setExaminationMark(examinationMark);
    }
  }

  public String report(){
    String result = "";
    for (Enrolment enrolment : enrollments) {
      result += enrolment.toString() + "\n";
    }
    return result;
  }

  public String reportAssessment(){
    String result = "";
    for (Enrolment enrolment : enrollments) {
      result += enrolment.toString() + "\n";
    }
    return result;
  }

  public void sort(){
    
  }
}
