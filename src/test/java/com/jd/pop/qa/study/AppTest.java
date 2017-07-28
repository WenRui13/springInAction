package com.jd.pop.qa.study;

import com.jd.pop.qa.study.config.AppConfig;
import com.jd.pop.qa.study.config.AppConfigNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/7/28
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/7/28
 */


@ContextConfiguration(classes = {AppConfigNew.class})
public class AppTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private Knight knight;
    @Autowired
    private Arms arms;


    @Test
    public void testredKnightNotNull() throws Exception {

        Assert.assertNotNull(knight);

        knight.fight();
    }

    @Test
    public void testArmsNotNull() throws Exception {
        Assert.assertNotNull(arms);
    }
}
