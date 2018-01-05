package com.fish.cn.handler;

import com.fish.cn.parser.RpcBeanDefinitionParser;
import com.fish.cn.parser.RpcServiceParser;
import com.fish.cn.rpcbean.RpcServiceBean;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * bean 注册
 *
 * @author leijie
 */
public class RpcNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("serviceBean", new RpcServiceParser());
    }
}
