package hello.springmvc.basic.request;

import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Slf4j
@Controller
public class RequestParamController {

    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        log.info("username={}, age={}",username, age);

        response.getWriter().write("ok");
    }

    @ResponseBody//return 문자를 view찾지 않고 그냥 문자그대로를 응답으로 박아버림
    @RequestMapping("/request-param-v2")
    public String requestParamV2(
            @RequestParam("username") String memberName,
            @RequestParam("age") int memberAge){
        log.info("username={}, age={}",memberName, memberAge);
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(//파라메터랑 변수명 맞추면 좀더 짧게 사용가능
            @RequestParam String username,
            @RequestParam int age){
        log.info("username={}, age={}",username, age);
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-v4")
    public String requestParamV4(String username, int age){//string,int,Integer같은 단순 타입은 @RequestParam 생략가능함
        log.info("username={}, age={}",username, age);
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(@RequestParam(required = true) String username, //required false면 그 요청파라미터 없어도 mapping됨 true면 안됨 true가 디폴트임
                                       @RequestParam(required = false) Integer age){//int에는 null 못들어가니까 Integer로 해서 확인하기
        log.info("username={}, age={}",username, age);
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-default")
    public String requestParamDefault(
            @RequestParam(required = true, defaultValue = "guest") String username,//defaultValue 값 안들어오면 기본으로 넣어줌 => required가 사실상 필요없음
            @RequestParam(required = false, defaultValue = "-1") int age) {
        log.info("username={}, age={}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-map")
    public String requestParamMap(@RequestParam Map<String, Object> paramMap){//모든 파라미터 받기
        log.info("username={}, age={}", paramMap.get("username"), paramMap.get("age"));
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@ModelAttribute HelloData helloData){//객체에 있는 프로퍼티들(getUser, setUser 요런거) 찾아서 해줌
        log.info("username={}, age={}", helloData.getUsername(),helloData.getAge());
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v2")
    public String modelAttributeV2(HelloData helloData){//@ModelAttribute 생략 가능
        log.info("username={}, age={}", helloData.getUsername(),helloData.getAge());
        return "ok";
    }



}
