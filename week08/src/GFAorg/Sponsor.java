package GFAorg;

public class Sponsor extends Person{
  private String company;
  private int hiredStudents = 0;

  public Sponsor (String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor(){
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire (){
    hiredStudents ++;
  }
}
