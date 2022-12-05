package com.kh.day10.d;

public class Car {
  int number;
  static int output;  //생산량
  
  public Car() {
    System.out.println("Car() 호출됨");
    number++;
    output++;
  }

  public void method1() {
    System.out.println("method1()호출됨!");
    System.out.println(number);
    System.out.println(output);
    method2();
  }
  public static void method2() {
    System.out.println("method2()호출됨!");
//    System.out.println(number);
    System.out.println(output);
//    method1();
  }
}
