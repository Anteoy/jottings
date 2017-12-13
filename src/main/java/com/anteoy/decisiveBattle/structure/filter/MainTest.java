package com.anteoy.decisiveBattle.structure.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class MainTest {
    private static final String[] names = {"name1","name2","name3","name4"};
    private static final String[] maritals = {"未婚","已婚"};
    private static final String[] sex = {"male","female"};


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int a=0;a<20;a++){
            Person person =  new Person(getRandomNames(),getMaritals(),getSex());
            persons.add(person);
        }
        System.out.println("====old");
        printPersons(persons);

        //single
        Criteria  criteria =new CriteriaSingle();
        criteria.meetCriteria(persons);
        System.out.println("====single");
        printPersons(criteria.meetCriteria(persons));
        System.out.println("====test");
        DealPersons(persons);
        printPersons(persons);

        System.out.println("and");
        criteria =  new AndCriteria(new CriteriaSingle(),new CriteriaMale());
        printPersons(criteria.meetCriteria(persons));

        System.out.println("or");
        criteria = new OrCriteria(new CriteriaSingle(),new CriteriaMale());
        persons = criteria.meetCriteria(persons);
        printPersons(persons);



    }

    private static void DealPersons(List<Person> persons){
        persons.get(0).gender = "日本人";
    }

    private static String getRandomNames2(){
        double a = Math.random();
        return names[(int)(a*names.length)];
    }

    private static String getRandomNames(){
        return names[new Random().nextInt(names.length)];
    }
    private static String getMaritals(){
        return maritals[new Random().nextInt(maritals.length)];
    }
    private static String getSex(){
        return sex[new Random().nextInt(sex.length)];
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
