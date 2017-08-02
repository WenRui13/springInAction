package com.jd.pop.qa.study.config;

import com.jd.pop.qa.study.api.Arms;
import com.jd.pop.qa.study.api.Knight;
import com.jd.pop.qa.study.iml.Gun;
import com.jd.pop.qa.study.iml.RedKnight;
import com.jd.pop.qa.study.iml.Sword;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
    @Profile("qa")
    public Arms sword() {
        return new Sword();
    }

    @Bean
    @Profile("dev")
    public Arms gun() {
        return new Gun();
    }
}
