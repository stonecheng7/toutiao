package com.nowcoder.toutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Type;
import java.util.Enumeration;

/**
 * @program: toutiao
 * @description: controller
 * @author: Cheng Qun
 * @create: 2019-02-25 14:24
 */
@Controller
public class IndexController {
    @RequestMapping(path = {"/","/index"})
    @ResponseBody
    public String index(){
        return "Hello Nowcoder";
    }


    @RequestMapping(value = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1" ) int type,
                          @RequestParam(value = "key",defaultValue = "nowcoder") String key){
        return String.format("{%s},{%d},{%d},{%s}",groupId,userId,type,key);
    }

    @RequestMapping(value = {"/vm"})
   // @ResponseBody
    public String news(){
        return "news";
    }
    @RequestMapping(value={"/request"})
    @ResponseBody
    public String request(HttpServletRequest request,
                          HttpServletResponse response,
                          HttpSession session){
        StringBuilder sb = new StringBuilder();
        Enumeration<String> headerNames = request.getHeaderNames()
    }
}
