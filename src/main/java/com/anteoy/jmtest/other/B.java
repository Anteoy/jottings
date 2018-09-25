package com.anteoy.jmtest.other;

public abstract class B extends A {

  @Override
  public void funA(String a) {
    System.out.println(getClass() + " call String :" + a);
    this.funA(999999);
  }

  @Override
  public void funA(int a) {
    System.out.println(getClass() + " call int :" + a);
    super.funA(a);
  }
}
