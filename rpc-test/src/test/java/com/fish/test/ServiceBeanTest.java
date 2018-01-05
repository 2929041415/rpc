package com.fish.test;

import com.fish.cn.rpcbean.RpcServiceBean;
import org.junit.Test;

import javax.annotation.Resource;

public class ServiceBeanTest extends BaseJunit4Test {


    @Resource
    private RpcServiceBean rpcServiceBean;

    @Test
    public void test() {
        System.out.println(rpcServiceBean.getInterfaceName());
        System.out.println("启动完成.....");
    }
}
