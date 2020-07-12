package GFAOrgClone;

  public class Student extends Person implements Cloneable{
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
      super(name, age, gender);
      this.previousOrganization = previousOrganization;
      skippedDays = 0;
    }

    public Student() {
      this("Jane Doe", 30, "female", "The School of life");
    }

    @Override
    public void getGoal() {
      System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
      System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
      skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
      return new Student(name, age, gender, previousOrganization);
    }

    @Override
    public String toString() {
      return name;
    }
}
