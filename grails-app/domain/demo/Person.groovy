package demo

class Person {
    String name
    Integer age
    String streetName
    String city
    String zipCode

    static constraints = {
        name blank:false, maxSize:100
        age  nullable:true, min:0
        streetName  nullable:true
        city        nullable:true
        zipCode     nullable:true
    }

    static mapping = {
        version false
    }
}
