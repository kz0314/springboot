package com.aiye.springboot;

/** 第一个springboot
 * @Author Ay-z
 * @Date: 2020/3/9 14:31
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
//@restController ==  @Controller + @ResponseBody
public class HelloController {

    /*//获取.yml内的值
    @Value("${name}")
    private String name;
    //获取csdnUrl
    @Value("${csdnUrl}")
    private String csdnUrl;*/

//    使用封装调用第三个,需要使用Autowired
    @Autowired
    private Author author;

    //路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
    @RequestMapping("testTwo")
    public String tt(){
        return "名字："+author.getName()+"、地址："+author.getMyUrl();
    }


//    //路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
//    @RequestMapping("test")
//    public String te(){
//        return "名字："+name+"网址："+csdnUrl;
//    }

    //路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("This isSpring Boot!");
        System.out.println("This is  not Spring Boot!");
        return "Hello Spring Boot!";
    }
}
