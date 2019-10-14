package cn.ncut.flinkserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.ncut.flinkserver.dao")
@SpringBootApplication
public class FlinkserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlinkserverApplication.class, args);
    }

}
