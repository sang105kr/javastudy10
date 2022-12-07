package com.kh.day13.c;

public class Main {
  public static void main(String[] args) {
    HighStudent s = new HighStudent();
    s.testSat();
    s.eat();
    s.study();

    ((Student)s).study();
    ((Student)s).eat();

    ((Person)s).eat();

    ((Object)s).toString();
  }
}
