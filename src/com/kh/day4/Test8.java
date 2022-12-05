package com.kh.day4;

/**
 * 가위바위보 게임을 구현하시오
 * Math.random() :  0.0 <= 실수값 < 1.0
 */
public class Test8 {
  public static void main(String[] args) {

    for(int i=1; i<=6; i++) {
      int x = (int)(Math.random() * 45) + 1;
      System.out.println(x);
    }
    
    // "가위"
//    String str = "가위";
//    String str2 = "주먹";
//    if(str.equals(str2)){
//      System.out.println("같다");
//    }else{
//      System.out.println("다르다");
//    }
  }
}
