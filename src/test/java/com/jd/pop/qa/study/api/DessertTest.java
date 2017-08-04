package com.jd.pop.qa.study.api;

import com.jd.pop.qa.study.annotations.dessertDescription.Cold;
import com.jd.pop.qa.study.annotations.dessertDescription.Milk;
import com.jd.pop.qa.study.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/3
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/3
 */
@ContextConfiguration(classes = {AppConfig.class})
public class DessertTest extends AbstractTestNGSpringContextTests {

    @Autowired
    @Cold
    @Milk
    private Dessert dessert;

    @Test(description = "@Qualifier优先级高于@Primary")
    public void testPrimary_1() throws Exception {
        System.out.println(dessert.getClass().getName());
        Assert.assertNotEquals(dessert.getClass().getName(), "com.jd.pop.qa.study.iml.Cake");
    }


    @Test
    public void testQualifierBySelfDefined() throws Exception {
        System.out.println(dessert.getClass().getName());

    }


}