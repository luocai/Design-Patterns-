package com.cai.proxy.cglibProxy;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    //给目标对象创建代理对象
    public Object getProxyInstance(){
        /**
         * 1.工具类，允许为非接口类型创建一个Java代理。Enhancer动态创建了给定类型的子类但是拦截了所有的方法。
         * 和Proxy不一样的是，不管是接口还是类他都能正常工作
         */
        Enhancer en = new Enhancer();
        /**
         * 2.设置父类
         */
        en.setSuperclass(target.getClass());
        /**
         * 3.设置回掉函数(因为MethodInterceptor继承了Callback类,默认执行intercept方法)
         */
        en.setCallback(this);
        /**
         * 4.创建子类
         */
        return en.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始保存");
        Object returnObject = method.invoke(target,objects);
        System.out.println("保存结束");
        return returnObject;
    }
}
