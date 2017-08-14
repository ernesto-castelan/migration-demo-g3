package demo

class Person {
    String name
    Integer age

    static constraints = {
        name blank:false, maxSize:50
        age  min:0
    }

    static mapping = {
        version false
    }
}
