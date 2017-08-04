package com.jd.pop.qa.study.iml;

import com.jd.pop.qa.study.annotations.dessertDescription.Fruit;
import com.jd.pop.qa.study.annotations.dessertDescription.Soft;
import com.jd.pop.qa.study.api.Dessert;
import org.springframework.stereotype.Component;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/3
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/3
 */
@Component
@Fruit
@Soft
public class Cookies implements Dessert {
}
