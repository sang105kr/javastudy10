package com.kh.day9.d;

public class Tv {
  //명사:속성
  public String color;
  public String maker;
  public boolean onOff;  // 전원 on,off 상태
  public int volume;     // 소리 단계
  public int channel;    // 채널

  // 생성자(consturctor) 메소드
  public Tv() {
    
  }

  public Tv(String color, String maker) {
    this.color = color;
    this.maker = maker;
  }

  //동사:행위
  //켜다
  public void turnOn() {
    System.out.println("켜다");
    this.onOff = true;
  }
  //끄다
  public void turnOff() {
    System.out.println("끄다");
    this.onOff = false;
  }
  //볼륨을 높이다.
  public void upVolume() {
    System.out.println("볼륨을 높이다.");
  }
  //채널을 상향하다.
  public void upChannel() {
    System.out.println("채널을 상향조절하다.");
  }
}

