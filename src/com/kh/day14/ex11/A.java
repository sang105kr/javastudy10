package com.kh.day14.ex11;

import java.util.Objects;

public class A {
  int data;

  A(int data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    A a = (A) o;
    return data == a.data;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }
}
