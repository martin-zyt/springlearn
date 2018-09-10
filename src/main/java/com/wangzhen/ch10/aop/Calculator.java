package com.wangzhen.ch10.aop;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:42 2018/9/10
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Calculator {
    //业务逻辑方法
    public int div(int i, int j)  {
        System.out.println("业务逻辑--------");
        return i/j;
    }
}
