package com.kh.day17.ex7;

import java.util.Comparator;

public class MyData implements Comparable<MyData> {
  String str;

  public MyData(String str) {
    this.str = str;
  }

//  @Override
//  public int compareTo(MyData o) {
//    return 0;
//  }


  @Override
  public int compareTo(MyData o) {
    return str.compareTo(o.str);
  }

  @Override
  public String toString() {
    return str;
  }
}
