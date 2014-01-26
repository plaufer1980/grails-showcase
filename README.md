grails-showcase
===============

A little project to showcase some of the nice features of Grails and its eco-system.

* clone the project
* run with `grails run-app`
* go to [http://localhost:8080/grails-showcase](http://localhost:8080/grails-showcase) to explore the project in your browser


Scaffolding Example: `AdController`
-----------------------------------
Go to [http://localhost:8080/grails-showcase/ad](http://localhost:8080/grails-showcase/ad) to checkout a scaffolded
view of the `Ad` domain. You can list, create, edit and delete entities from here.
Try to create a new ad and note how the different properties of the `Ad` are mapped to proper form input fields,
like date picker or numeric fields. There's inline validation with internationalized error messages. Associations, to
`Make` in this case, are nicely pre-populated into drop-down select fields.


RESTful Resource Example: `Make`
--------------------------------
The `Make` domain is annotated with `@Resource` which automatically provides RESTful operations for makes.
Run `grails url-mapping-report` to get an overview of the provided REST actions.
Go to following URLs to checkout different format support:

* [http://localhost:8080/grails-showcase/makes](http://localhost:8080/grails-showcase/makes)
* [http://localhost:8080/grails-showcase/makes/1.json](http://localhost:8080/grails-showcase/makes/1.json)
* [http://localhost:8080/grails-showcase/makes/1.xml](http://localhost:8080/grails-showcase/makes/1.xml)


Spock Testing Example: `HelloControllerSpec`
--------------------------------------------
Grails comes with Spock as a testing framework. Checkout `HelloControllerSpec` to see how nicely Spock tests can read.


Meta-Programming Example: `AdIntegrationSpec` powered by _build-test-data_ plugin
---------------------------------------------------------------------------------
The _build-test-data_ plugin extends your domain objects with a `build()` method in integration tests that populates
all mandatory fields and even mandatory association graphs. This is done via Groovy's meta-programming model.
In the example test the `Ad.build()` will automatically populate the non-nullable `make` property with a proper `Make`
object.


Asynchronous Programming Example: `AsyncController`
---------------------------------------------------
tbd ...