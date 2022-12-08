package com.kh.day14.ex4;

/**
 * 1) 상속관계에서 자동형변환 : 상위개념에 하위개념 대입은 가능
 * 2) 상속관계에서 강제형변환 : 하위개념에 상위개념을 대입할때(인스턴스의 타입이상의 타입이어야한다)
 */
public class Main {
  public static void main(String[] args) {
    A a1 = new A();
//    B b1 = (B)a1; //컴파일시점(O),런타입시점(X)
//    C c1 = (C)a1; //컴파일시점(O),런타입시점(X)
//    D d1 = (D)a1; //컴파일시점(O),런타입시점(X)
//    E e1 = (E)a1; //컴파일시점(O),런타입시점(X)

    A a2 = new B(); //컴파일시점(O),런타입시점(O)
    B b2 = (B)a2;   //컴파일시점(O),런타입시점(O)
//    C c2 = (C)a2;  //컴파일시점(O),런타입시점(X)
//    D d2 = (D)a2;  //컴파일시점(O),런타입시점(X)
//    E e2 = (E)a2;  //컴파일시점(O),런타입시점(X)

    A a3 = new C(); //컴파일시점(O),런타입시점(O)
    B b3 = (B)a3;   //컴파일시점(O),런타입시점(O)
    C c3 = (C)a3;   //컴파일시점(O),런타입시점(O)
//    D d3 = (D)a3;   //컴파일시점(O),런타입시점(X)
//    E e3 = (E)a3;   //컴파일시점(O),런타입시점(X)
  }
}
