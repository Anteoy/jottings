package com.anteoy.decisiveBattle.structure.filter;

import java.util.List;

/**
 * Created by zhoudazhuang on 17-12-13.
 * 过滤标准
 */
public interface Criteria {
    //meetCriteria 符合标准
    List<Person> meetCriteria(List<Person> persons);
}
