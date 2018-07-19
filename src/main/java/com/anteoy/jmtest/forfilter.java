package com.anteoy.jmtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther zhoudazhuang
 * @date 18-7-19 13:29
 * @description
 */
public class forfilter {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList();
    List<Integer> ids = new ArrayList<>(); // 用来临时存储person的id
    persons.add(new Person(1, "name1", 10));
    persons.add(new Person(2, "name2", 21));
    persons.add(new Person(5, "name5", 55));
    persons.add(new Person(3, "name3", 34));
    persons.add(new Person(1, "name1", 10));

    //    List<Person> personList =
    persons =
        persons
            .stream()
            .filter( // 过滤去重
                v -> {
                  boolean flag = !ids.contains(v.getId());
                  if (flag) {
                    ids.add(v.getId());
                  }
                  return flag;
                })
            .collect(Collectors.toList());
    System.out.println(persons);
    //    System.out.println(personList);
    System.out.println(ids);
  }
}
