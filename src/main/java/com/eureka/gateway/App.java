package com.eureka.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Prasanth.P
 *
 */
@SpringBootApplication
@EnableZuulProxy
@RestController
public class App {
  public static void main(String[] args) {
    new SpringApplicationBuilder(App.class).web(true).run(args);
  }

  @Bean
  public AlwaysSampler defaultSampler() {
    return new AlwaysSampler();
  }
}
