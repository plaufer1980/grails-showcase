package grails.showcase

import grails.async.PromiseMap
import static grails.async.Promises.*

class AsyncController {

    def stock(String ticker) {
        task {
            ticker = ticker ?: 'GOOG'
            def url = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=${ticker}&f=nsl1op&e=.csv")
            Double price = url.text.split(',')[-1] as Double
            render "ticker: $ticker, price: $price"
        }
    }

    def promiseMap() {
        final long start = System.currentTimeMillis()

        def map = new PromiseMap()
        map['google'] = {
            new URL('http://www.google.com').text
            System.currentTimeMillis() - start
        }
        map['bing'] = {
            new URL('http://www.bing.com').text
            System.currentTimeMillis() - start
        }
        map['yahoo'] = {
            new URL('http://www.yahoo.com').text
            System.currentTimeMillis() - start
        }

        def results = map.get()
        render results
    }

}
