package pl.aredlisiak.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    private static final String PATH_REPLACEMENT = "/${segment}";

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                      .route(r -> r.path("/config/**")
                                   .filters(f -> f.rewritePath("/config/(?<segment>.*)", PATH_REPLACEMENT))
                                   .uri("http://localhost:6888/")
                                   .id("config"))
                      .route(r -> r.path("/discovery/**")
                                   .filters(f -> f.rewritePath("/discovery/(?<segment>.*)", PATH_REPLACEMENT))
                                   .uri("http://localhost:6761/")
                                   .id("discovery"))
                      .route(r -> r.path("/main/**")
                                   .filters(f -> f.rewritePath("/main/(?<segment>.*)", PATH_REPLACEMENT))
                                   .uri("http://localhost:8081/")
                                   .id("main"))
                      .route(r -> r.path("/secondary/**")
                                   .filters(f -> f.rewritePath("/secondary/(?<segment>.*)", PATH_REPLACEMENT))
                                   .uri("http://localhost:8082/")
                                   .id("secondary"))
                      .build();
    }
}
