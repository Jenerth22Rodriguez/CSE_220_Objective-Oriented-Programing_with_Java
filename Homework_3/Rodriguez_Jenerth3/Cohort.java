package HW.HW3.Assignment3Files;
import java.util.ArrayList;

public class Cohort {
    private ArrayList<Student> students;
    
    public Cohort() {
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
    
   public Student getStudent(String firstname, String lastname) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstname) && student.getLastName().equals(lastname)) {
                return student;
            }
        }
        return null;
    }
     public Student getStudentEarliestName() {
        if (students.isEmpty()) {
            return null;
        }
        Student earliest = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getLastName().compareTo(earliest.getLastName()) < 0) {
                earliest = current;
            } else if (current.getLastName().equals(earliest.getLastName())
                    && current.getFirstName().compareTo(earliest.getFirstName()) < 0) {
                earliest = current;
            }
        }
        return earliest;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString());
            sb.append("\n\n");
        }
        return sb.toString().trim();
    }
}
