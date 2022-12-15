package com.kh.day17.f;

public class Main {
  public static void main(String[] args) {
    Student p1 = new Student();
    Teacher p2 = new Teacher();
  }
  static void eat(Person person){
    person.eat();
    System.out.println("처리");
  }
}
