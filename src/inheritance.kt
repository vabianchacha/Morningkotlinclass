// parent class /base class/super class---------

open class Animal{
    var  age = 12
    var  gender = "male"



    fun makesound (){
        println("Animal is speaking")


    }


    class dog:Animal(){
        fun bark(){
            println("Dog is woofing")
        }
    }
    class cat: Animal() {
        fun meow(){
            println("Cat is meowing")
        }
    }

}

fun main() {
    var a = Animal()
    var d = Animal.dog()
    var c = Animal.cat()


}