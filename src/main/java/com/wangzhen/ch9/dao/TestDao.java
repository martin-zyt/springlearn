package com.wangzhen.ch9.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:40 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Repository
public class TestDao {
    private String flag = "1";
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDao...... [flag=" + flag + "]";
    }
}
