package hello.springmvc.basic;

import lombok.Data;

@Data//getter,setter,tostring,equalhashcode,requiredArgsConstructor모두 적용시켜줌
public class HelloData {
    private String username;
    private int age;
}
