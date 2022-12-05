package com.kh.day9.f;

import java.lang.*;

public class Person {
  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(int age) {
    this.age = age;
  }

  public void smile() {
    System.out.println("웃다");
  }
  
  public void sleep() {
    System.out.println("자다");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
