package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j//롬복이 제공하는 거임
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass()); //@Slf4j있으면 생략함

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        //종류가 많음!!!!!!!!!!!!!!!!!!
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        //요런식으로 하면 로고 찍힘 => 엄청 많은 정보 찍힘

        return "ok";//@RestController 때문에 뷰이름이 아니라 문자그대로 반환
    }
}
