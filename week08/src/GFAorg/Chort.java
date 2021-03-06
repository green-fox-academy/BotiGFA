package GFAorg;

import java.util.ArrayList;

public class Chort {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public Chort(String name) {
    students = new ArrayList<>();
    mentors = new ArrayList<>();
    this.name = name;
  }
}
