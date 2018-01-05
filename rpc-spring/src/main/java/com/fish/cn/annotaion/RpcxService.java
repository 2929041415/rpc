package com.fish.cn.annotaion;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcxService {

    String value() default "";

}
