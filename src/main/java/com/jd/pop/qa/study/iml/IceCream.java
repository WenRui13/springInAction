package com.jd.pop.qa.study.iml;

import com.jd.pop.qa.study.annotations.dessertDescription.Cold;
import com.jd.pop.qa.study.annotations.dessertDescription.Milk;
import com.jd.pop.qa.study.api.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/3
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/3
 */
@Component
@Cold
@Milk
public class IceCream implements Dessert {
}
