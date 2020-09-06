package org.study.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author x.zaft
 * @Date 2020/9/6
 * @Version V1.0
 **/
@RestController
public class ServerController {

    @GetMapping("/test")
    public String getTest(){
        return "this is a server";
    }
}
