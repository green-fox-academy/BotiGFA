package GFAOrgClone;

public class Main {
  public class Main {
    public static void main(String[] args) {
      Student john = new Student("John", 20, "male", "BME");
      Student johnTheClone = john.clone();
      System.out.println(johnTheClone);
    }
  }
}
