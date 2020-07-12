package sumFirst;

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class toDo {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    StringBuilder addedMyTodoAtTheBeginning = new StringBuilder(todoText);
    addedMyTodoAtTheBeginning.insert(0, "My todo:\n");
    addedMyTodoAtTheBeginning.append(" - Download games\n");
    addedMyTodoAtTheBeginning.append("\t - Diablo");

    System.out.println(addedMyTodoAtTheBeginning);
  }
}