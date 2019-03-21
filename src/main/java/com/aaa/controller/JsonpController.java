package com.aaa.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * fileName:Jsonp
 * description:
 * author:Ldl
 * createTime:2019-03-20 9:45
 */
@RestController
@RequestMapping("jsonp")
public class JsonpController {

    @RequestMapping("getJ")
    public String getJ(@RequestParam Map map){
        String callback = (String) map.get("callback");
        System.out.println(callback+"---------------------------------------");
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Map m = new HashMap();
            m.put("id",i);
            m.put("naem","user"+i);
            list.add(m);
        }
        String s = JSON.toJSONString(list);

        return callback+"("+s+")";
    }
}
