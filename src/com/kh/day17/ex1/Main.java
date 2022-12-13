package com.kh.day17.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2);
    //list.add(3); // 요소의 길이 추가 불가;
    //list.remove(1); // 요소길이 축소 불가
    
    // 탐색 가능
    Integer integer = list.get(1);
    System.out.println(integer);

    // 요소 수정 가능
    list.set(1, 3);
    System.out.println(list);

  }
}
