package com.kh.day15.c;

public class Main {
  public static void main(String[] args) {
    // ArrayIndexOutOfBoundsException
    int[] a = new int[3];
//    a[0] = 10;
//    a[3] = 20;

    // NullPointException
    a = null;
//    a[0] = 10;


    // ArithmeticException
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
//      System.out.println(e.getMessage());
//      System.out.println(e.getCause());
//      ArithmeticException e2 = new ArithmeticException("나누기 오류");
//      System.out.println(e2.getMessage());
      return;
    } finally {
      System.out.println("finnaly 절 실행됨!");
    }

    System.out.println("프로그램종료!");
  }
}
