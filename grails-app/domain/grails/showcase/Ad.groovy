package grails.showcase


class Ad {

    Make make
    String model
    Integer mileage
    Date firstRegistration
    String description
    BigDecimal price

    static constraints = {
        make blank: false
        model nullable: true, maxSize: 48
        mileage nullable: true
        firstRegistration nullable: true
        description nullable: true, maxSize: 10000
        price nullable: true, scale: 2
    }

}
