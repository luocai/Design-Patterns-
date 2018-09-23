package com.cai.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
    private Object obj;

    public ProxyFactory(Object obj) {
        this.obj = obj;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
            obj.getClass().getInterfaces(),
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                	System.out.println("大家好，我是周杰伦，哎呦不错哦"); //增加的功能
                    Object returnObject = method.invoke(obj,args);
                    System.out.println("观众朋友们，我唱完歌啦，我要回去喝奶茶啦 拜拜");	//增加的功能
                    return returnObject;
                } 
            });
    }
}