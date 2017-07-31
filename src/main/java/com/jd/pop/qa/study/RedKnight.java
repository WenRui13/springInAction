package com.jd.pop.qa.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("红骑士")
    private String name;
    private Arms arms;

    public void fight() {
        System.out.println("我是一个" + name);
        arms.fight();

    }

    @Autowired
    @Qualifier("sword")
    public void setArms(Arms arms) {
        this.arms = arms;
    }

    @PostConstruct
    public void initBean() {
        System.out.println(this.getClass() + "实例化完成");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass() + "实例清理完成");
    }
}
