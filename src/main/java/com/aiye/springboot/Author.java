package com.aiye.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Ay-z
 * @Date: 2020/3/14 15:27
 */
@Component
@ConfigurationProperties(prefix = "author")
//@Component：表明当前类是一个 Java Bean
//@ConfigurationProperties(prefix = “author”)：表示获取前缀为 author 的配置信息
public class Author {
    private String name;
    private String myUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyUrl() {
        return myUrl;
    }

    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }
}
