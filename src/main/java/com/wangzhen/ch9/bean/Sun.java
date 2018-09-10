package com.wangzhen.ch9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:39 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Component
public class Sun {
    private Moon moon;

    public Sun(@Autowired Moon moon){
        this.moon = moon;
        System.out.println("..Constructor................");
    }
    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Sun [moon=" + moon + "]";
    }
}
