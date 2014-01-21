import grails.showcase.Ad
import grails.showcase.Make

class BootStrap {

    def init = { servletContext ->
        Make audi = new Make(key: 'AUDI', name: 'Audi').save()
        Make bmw = new Make(key: 'BMW', name: 'BMW').save()
        new Make(key: 'MERCEDES-BENZ', name: 'Mercedes-Benz').save()
        new Make(key: 'VW', name: 'Volkswagen').save()

        new Ad(
                make: audi,
                model: 'A4',
                firstRegistration: new Date() - 365,
                description: 'fancy car',
                price: "10000" as BigDecimal
        ).save()

        new Ad(
                make: bmw,
                mileage: 25000,
                price: "7999" as BigDecimal
        ).save()
    }

    def destroy = {
    }
}
