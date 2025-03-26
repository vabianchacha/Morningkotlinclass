class Dog(var name:String,var breed:String,var age:Int){

}

fun main() {
    var dog1 = Dog("Brighton","chihuaha",2)
    println(dog1.name)
    var dog2 = Dog("Jerry","Pitbull",8)
    println(dog2.breed)
    var dog3 = Dog("tinah","Pitbull",7)
    println(dog3.age)
    var dog4 = Dog("","Pitbull",5)
    println(dog4.breed)
}