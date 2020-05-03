package pl.aredlisiak.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                      .route(r -> r.path("/config/**")
                                   .filters(f -> f.rewritePath("/config/(?<segment>.*)", "/${segment}"))
                                   .uri("http://localhost:6888/")
                                   .id("config"))

                      .route(r -> r.path("/discovery/**")
                                   .filters(f -> f.rewritePath("/discovery/(?<segment>.*)", "/${segment}"))
                                   .uri("http://localhost:6761/")
                                   .id("discovery"))
                      .build();
    }
}
