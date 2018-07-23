package com.anteoy.coreJava.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
        //list1.add(20);�����
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);
        //����Ĳ������Ǳ���֮��Ĳ���

        /*
         * c1==c2�������true˵������֮�󼯺ϵķ�����ȥ���ͻ���
         * Java�м��ϵķ��ͣ��Ƿ�ֹ��������ģ�ֻ�ڱ���׶���Ч��
         * �ƹ��������Ч��
         * ��֤�����ǿ���ͨ�������ķ������������ƹ�����
         */
        try {
            Method m = c2.getMethod("add", Object.class);
            m.invoke(list1, 20);//�ƹ�����������ƹ��˷���
            System.out.println(list1.size());
            System.out.println(list1);
			/*for (String string : list1) {
				System.out.println(string);
			}*///���ڲ�����������
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
