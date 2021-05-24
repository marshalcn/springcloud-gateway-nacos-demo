package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author madechao
 * @menu
 * @description
 * @createTime 14:00 2021/5/21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/a/**")
                        .uri("http://localhost:9099/"))
                .route("path_route", r -> r.path("/b/**")
                        .uri("http://localhost:9098/"))
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
