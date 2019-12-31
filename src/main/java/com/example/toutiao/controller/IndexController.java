package com.example.toutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){
        return "hello";
    }
    @RequestMapping(value = {"/profile/{groupid}/{userid}"})
    @ResponseBody
    public String profile(@PathVariable ("groupid") String groupid,
                          @PathVariable ("userid") int userid,
                          @RequestParam(value = "type",defaultValue = "1") int type,
                          @RequestParam(value = "key",defaultValue = "now") String key){
        return String.format("%s,%d,%d,%s",groupid,userid,type,key);
    }
    @RequestMapping(value = {"/vm"})
    public String vm(){
        return "news";
    }
}
