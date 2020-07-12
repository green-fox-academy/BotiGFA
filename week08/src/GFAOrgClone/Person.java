package GFAOrgClone;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }

    public Person() {
      this("Jane Doe", 30, "female");
    }

    public void introduce() {
      System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
      System.out.println("My goal is: Live for the moment!");
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public String getGender() {
      return gender;
    }
  }
