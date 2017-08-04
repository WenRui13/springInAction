package com.jd.pop.qa.study.annotations.dessertDescription;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @FunctionDesc 自定义注解，用于描述dessert的特性，描述性语言
 * @Author bjyfxuxiaojun
 * @CreateDate 2017/8/4
 * @Reviewer kongxiangyun
 * @ReviewDate 2017/8/4
 */


@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Cold {
}