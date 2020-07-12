package GFAorg;

public class Mentor extends Person {
  private String level = "junior";

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
  public Mentor (){
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
  }

}
