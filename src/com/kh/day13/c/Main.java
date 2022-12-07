package com.kh.day13.c;

public class Main {
  public static void main(String[] args) {
    HighStudent s = new HighStudent();
    s.testSat();
    s.eat();
    s.study();

    //up casting
    ((Student)s).study();
    ((Student)s).eat();
    //up casting
    ((Person)s).eat();
    //up casting
    ((Object)s).toString();

    Student s2 = new HighStudent();
    s2.study();
    s2.eat();
    // down casting
    ((HighStudent)s2).testSat();

    Person p1 = new Student();

    // down casting (o)
    ((Student)p1).study();
    // down casting (X)
    ((HighStudent)p1).study();
    ((HighStudent)p1).testSat();


  }
}
