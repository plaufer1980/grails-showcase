package grails.showcase

class HelloController {

  HelloService helloService

    def index() {
        render "Hello World!"
    }

    def service() {
        model: [message: helloService.hello()]
    }
}
