package com.jd.pop.qa.study.config;

import com.jd.pop.qa.study.Arms;
import com.jd.pop.qa.study.Knight;
import com.jd.pop.qa.study.RedKnight;
import com.jd.pop.qa.study.Sword;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/7/28
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/7/28
 */

@Configuration
public class AppConfigNew {

    @Bean
    public Knight knight() {
        return new RedKnight();
    }

    @Bean
    public Arms arms() {
        return new Sword();
    }
}
