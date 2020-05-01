package pl.aredlisiak.config

import org.springframework.test.context.ActiveProfiles
import pl.aredlisiak.test_lib.BaseIntSpec

@ActiveProfiles('native')
class ConfigApplicationSpec extends BaseIntSpec {

    def 'load context'() {
        expect:
        true
    }
}
