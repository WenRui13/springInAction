package com.jd.pop.qa.study.iml;

import com.jd.pop.qa.study.annotations.dessertDescription.Milk;
import com.jd.pop.qa.study.annotations.dessertDescription.Soft;
import com.jd.pop.qa.study.api.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/3
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/3
 */

@Component
@Soft
@Milk
@Primary
public class Cake implements Dessert {
}
