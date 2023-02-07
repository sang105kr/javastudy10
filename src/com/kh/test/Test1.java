package com.kh.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1 {
  public static void main(String[] args) throws IOException {
    StringTokenizer st1 = new StringTokenizer( "2+3-1*8/4", "+*-/");
    while(st1.hasMoreTokens()){
      String s = st1.nextToken();
      System.out.println(s);
    };
  }
};
