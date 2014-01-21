package grails.showcase

import grails.rest.Resource


@Resource(uri='/makes')
class Make {

    String key
    String name

    static constraints = {
        key blank: false, unique: true
        name blank: false, maxSize: 48
    }

    String toString() { name }

}
