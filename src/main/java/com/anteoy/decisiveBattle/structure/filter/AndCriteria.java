package com.anteoy.decisiveBattle.structure.filter;

import java.util.List;

/**
 * Created by zhoudazhuang on 17-12-13.
 * 组合过滤
 */
public class AndCriteria implements Criteria {

    public Criteria criteria;

    public Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }
}
