package com.anteoy.coreJava.reflect;

public class ClassDemo2 {
	public static void main(String[] args) {
		
		Class c1 = int.class;//int ��������
		Class c2 = String.class;//String���������   String���ֽ��루�Լ�������)
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());//�������������������
		System.out.println(c5.getName());
		System.err.println(new String("A").equals("b"));
	}

}
