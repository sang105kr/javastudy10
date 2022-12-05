package com.kh.day10.c;

public class Car3 {
//  속성 : 차량번호, 운행속도, 색상
  private static int currentNumber;
  private int number;
  private int speed;
  private String color;
  private final int SPEED_STEP = 10;

  // 생성자
  public Car3(String color) {
    this.color = color;
    this.currentNumber += 1;
    number = currentNumber;
  }

 //  행위 : 가속하다,감속하다
  public void speedUp() {
    if(this.speed + SPEED_STEP > 240){
      return;
    }
    speed += SPEED_STEP;  // speed = speed + 10;
  }
  public void speedDown() {
    if(this.speed - SPEED_STEP < 0){
      return;
    }
    speed -= SPEED_STEP;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNumber() {
    return number;
  }

  public int getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Car{" +
        "number=" + number +
        ", speed=" + speed +
        ", color='" + color + '\'' +
        '}';
  }

//  public static int number(){
//    return number;
//  }
}
