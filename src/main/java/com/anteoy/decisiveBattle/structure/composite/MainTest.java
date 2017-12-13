package com.anteoy.decisiveBattle.structure.composite;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class MainTest {
    public static void main(String[] args) {
        Employee employee =new Employee("ceo","CEO",1000000000);
        Employee employee1 = new Employee("cto","CTO",372918237);
        employee.add(employee1);
        Employee common1 =new Employee("common1","common1",7362763);
        Employee common2 =new Employee("common2","common2",7362763);
        employee1.add(common1);
        common1.add(common2);

        System.out.println(employee);
        for (Employee employee3 : employee.getSubEmployees()) {
            System.out.println(employee3);
            for (Employee employee2 : employee3.getSubEmployees()) {
                System.out.println(employee2);
            }
        }

    }
}
