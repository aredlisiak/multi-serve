package pl.aredlisiak.test_lib


import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles(TestConstants.TEST_PROFILE)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class BaseIntSpec extends Specification {}
