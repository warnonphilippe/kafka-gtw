package be.phw.kafka.gtw.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "be.phw.kafka.gtw")
public class FeignConfiguration {

}
