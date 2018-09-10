package com.wangzhen.ch9.controller;

import com.wangzhen.ch9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:40 2018/9/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
}
