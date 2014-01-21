package grails.showcase

import grails.test.spock.IntegrationSpec

class AdIntegrationSpec extends IntegrationSpec {

    void "build should make integration testing easier"() {
        given: "an ad conveniently built using build()"
            // just create an ad with all its mandatory fields and associations
            Ad ad = Ad.build()

        when: "querying the ad"
            Ad queriedAd = Ad.findById(ad.id)

        then: "the ad should be found"
            assert ad, queriedAd
    }

}
