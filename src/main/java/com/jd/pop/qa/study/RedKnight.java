package com.jd.pop.qa.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
