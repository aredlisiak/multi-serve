package pl.aredlisiak.discovery;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.aredlisiak.test_lib.TestConstants;

@Configuration
@Profile("!" + TestConstants.TEST_PROFILE)
@EnableEurekaServer
public class EurekaServerConfiguration {
}
