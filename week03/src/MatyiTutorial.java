package com.greenfox;

import java.lang.reflect.Array;
import java.util.Arrays;

class Main {

  public static void main(String[] args) {
    // Old-fashioned way
    String[] students = new String[10];
    students[0] = "Béla";
    students[1] = "Géza";
    students[2] = "Kriszta";


    for (int i = 0; i < students.length; i++) {
      String s = students[i];
      System.out.println(i + ": " + s);
    }

    // Modern way
    String[] newStudents = {"Béla", "Kriszta", "Géza"};
    for (String s : newStudents) {
      System.out.println(s);
    }

    Arrays.sort(newStudents);

    for (String s : newStudents) {
      System.out.println(s);
    }

    char[][] chessField = new char[8][8];
    for (int i = 0; i < chessField.length; i++) {
      char[] row = chessField[i];
      for (int j = 0; j < row.length; j++) {
        if ((i+j) % 2 == 0) {
          row[j] = '0';
        } else {
          row[j] = '1';
        }
        // row[j] = ((i + j) % 2 == 0) ? '0' : '1';
      }
    }

    for (char[] row : chessField) {
      for (char c : row) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}

