package com.ply.tmall;

import com.ply.tmall.util.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ply
 * @date 2021/10/2 - 15:50
 */

@SpringBootApplication
@EnableCaching
@EnableElasticsearchRepositories(basePackages = "com.ply.tmall.es")
@EnableJpaRepositories(basePackages = {"com.ply.tmall.dao", "com.ply.tmall.pojo"})
public class Application {
    static {
        PortUtil.checkPort(6379,"Redis 服务端",true);
        PortUtil.checkPort(9300,"ElasticSearch 服务端",true);
        //PortUtil.checkPort(5601,"Kibana 工具", true);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
