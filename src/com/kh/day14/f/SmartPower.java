package com.kh.day14.f;

public interface SmartPower extends Power,Voltage {
  default void smartOn(){
    System.out.println("스마트 충전하다");
  };
  static void smartOff() {
    System.out.println("스마트 전원 끄다");
  };
}
