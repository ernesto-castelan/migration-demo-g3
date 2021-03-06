package demo

class Person {
    String name
    Integer age

    static hasMany = [addresses:Address]

    static constraints = {
        name blank:false, maxSize:100
        age  nullable:true, min:0
    }

    static mapping = {
        version false
    }
}
