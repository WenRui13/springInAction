package com.jd.pop.qa.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/7/28
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/7/28
 */

@Component
public class RedKnight implements Knight {
    private Arms arms;

    public void fight() {
        arms.fight();

    }

    @Autowired
    public void setArms(Arms arms) {
        this.arms = arms;
    }

    @PostConstruct
    public void  initBean() {
        System.out.println(this.getClass()+"实例化完成");
    }

    @PreDestroy
    public void  destroy() {
        System.out.println(this.getClass()+"实例清理完成");
    }
}
