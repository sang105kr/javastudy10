package com.kh.day13.b;

public class Person {
  private String name;
  private int age;
  private String national;

  // 인스턴스 초기화 블럭
  {
    String[] national = {"한국인","중국인","일본인"};
    this.national = national[ (int)(Math.random()*3) ];
    System.out.println("인스턴스 초기화 블럭 호출됨!");
  }
  public Person() {
    super();
  }

  public Person(String name) {
    super();
    this.name = name;
    System.out.println("public Person(String name) called!");
  }

  public Person(int age) {
    super();
    this.age = age;
    System.out.println("public Person(int age) called!");
  }

  public Person(String name, int age) {
    this(name);
    this.age = age;
    System.out.println("public Person(String name, int age) called!");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", national='" + national + '\'' +
        '}';
  }
}
