package jpabook.jpashop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j//로그 찍는용
public class HomeController {

    @RequestMapping("/")
    public String home(){
        log.info("home controller");//로그 찍는 용
        return "home";
    }

}
