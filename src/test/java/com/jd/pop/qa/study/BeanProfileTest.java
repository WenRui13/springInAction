package com.jd.pop.qa.study;

import com.jd.pop.qa.study.api.Arms;
import com.jd.pop.qa.study.config.AppConfigNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @FunctionDesc 条件化bean测试
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/2
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/2
 */
@ContextConfiguration(classes = {AppConfigNew.class})
@ActiveProfiles("qa")
public class BeanProfileTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private Arms arms;

    @Test
    public void testProfileBeanAutowired() throws Exception {

        Assert.assertEquals(arms.getClass().getName(),"com.jd.pop.qa.study.iml.Sword");

    }
}
