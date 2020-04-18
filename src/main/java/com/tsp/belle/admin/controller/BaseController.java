package com.tsp.belle.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author likeWind
 * @date created in 16:24 2020/4/16
 * @description
 */
@Controller
public class BaseController {

    /**
     * 测试用 跳转到url
     * @param url 将要跳转的url
     * @return
     */
    @GetMapping("test/{url}")
    public String redirectUrl(@PathVariable String url){
        return url;
    }

}
