package com.wangzhen.proxy;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:24 2018/9/12
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class UserManagerImpl implements UserManager {

    public void addUser(String id, String password) {
        System.out.println(".: 调用了UserManagerImpl.addUser()方法！ ");

    }

    public void delUser(String id) {
        System.out.println(".: 调用了UserManagerImpl.delUser()方法！ ");

    }
}
