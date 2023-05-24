package com.spring.mvc.controller01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 해당 어노테이션이 있어야, 스프링 코어가 관리하는 컨트롤러가 됨.
public class MVCController01 {

    // 특정 주소를 접속했을때 처리할 로직을 작성합니다.
    @RequestMapping("/hello") // localhost:8080 이 기본주소이고, 뒤에 /hello를 붙여 접속시 실행
    public String hello(){
        System.out.println("/hello 접속 감지!!!!!");
        // 어떤 .jsp파일과 연동할지 terurn구문에 문자열로 파일 이름을 적어줌
        // prefix였던 /WEB-INF/views 와 suffix였던 .jsp를 앞뒤로 붙여서
        // 최정적으로 열리는 파일은 /WEB-INF/views/hello.jsp

        return "hello";
    }

    @RequestMapping("/bye") // localhost:8080 이 기본주소이고, 뒤에 /bye 붙여 접속시 실행
    public String bye(){
        System.out.println("/bye 접속 감지!!!!!");

        // bye.jsp 출력
        return "bye";
    }

    // html의 get방식 요청만 허용하는 어노테이션
    @GetMapping("/getreq") // localhost:8080/getreq 접속허용
    public String getReq(){
        System.out.println("get방식 요청을 감지했습니다!!");
        return "reqview";
    }

    @PostMapping("/postreq") // localhost:8080/getreq 접속허용
    public String postReq(){
        System.out.println("post방식 요청을 감지했습니다!!");
        return "reqview";
    }
}