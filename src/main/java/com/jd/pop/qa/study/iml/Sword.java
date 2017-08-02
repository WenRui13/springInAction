package com.jd.pop.qa.study.iml;

import com.jd.pop.qa.study.api.Arms;
import org.springframework.stereotype.Component;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/7/28
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/7/28
 */


@Component
public class Sword implements Arms {
    public void fight() {
        System.out.println("use sword to fight.");
    }
}
