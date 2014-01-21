package grails.showcase

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    void "index should render message"() {
        when: "index action is called"
            controller.index()

        then: "a message is rendered"
            assert "Hello World!", response.text
    }

}
