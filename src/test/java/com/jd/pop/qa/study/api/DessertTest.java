package com.jd.pop.qa.study.api;

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
    private Dessert dessert;

    @Test
    public void testPrimary_1() throws Exception {
        System.out.println(dessert.getClass().getName());
        Assert.assertEquals(dessert.getClass().getName(), "com.jd.pop.qa.study.iml.Cake");
    }
}