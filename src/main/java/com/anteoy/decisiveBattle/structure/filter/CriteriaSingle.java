package com.anteoy.decisiveBattle.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> persons1 = new ArrayList<>();
        persons.stream().filter(a -> a.getMaritalStatus().equals("未婚")).forEach(a -> persons1.add(a));
        return persons1;
    }
}
