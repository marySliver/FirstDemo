package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        /*
        String s1 = "2";
        String s2 = "2";
        System.out.println(s1==s2);
        System.out.println("你好");*/
        /*int i = 0;
        for(foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }*/

        /*==============1==============*/
        Integer a = 1;
        Integer b = 1;
        Integer c = 500;
        Integer d = 500;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    static boolean foo(char c) {
        System.out.println(c);
        return true;
    }

}
