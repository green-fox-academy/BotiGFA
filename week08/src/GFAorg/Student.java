package GFAorg;

public class Student extends Person{
  private String previousOrganization = "The School of Life";
  private int skippedDays = 0;

  public Student (String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }
    public Student() {
    }
@Override
  public void getGoal(){
  System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }
public void skipDays (int numberOfdays) {
    skippedDays += numberOfdays;
  }
}

