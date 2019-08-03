package org.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duankun1997@qq.com on 2019/8/3 14:44
 */
@RestController
public class InfController {
    @RequestMapping("/init")
    public String login(){
        return "你是蔡徐坤";
    }
}
