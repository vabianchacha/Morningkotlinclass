fun main() {
    //standard library functions-------


    var output = Math.sqrt(81.0)
    println("The squareroot of 81.0 is: $output")

    var roundedvalue = Math.round(34.78)
    println(roundedvalue)


    //calling function----------

    name()
    add()
    employee("John",90000,false)
    employee("willy",80000,true)
    employee("Samson",70000,false)
    employee("Janet",50000,true)
    employee("Philip",60000,true)

    student("Brian",23,"MIT")


}


//user defined functions-----


fun name(){
    println("Vanycha")
}

fun add (){
    var x =20
    var y =30
    println(x+y)
}

//Parameter/Variable and Argument/value--------


fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary.disability $disability")

}

fun student(name: String,age:Int,course:String){
    println("$name is $age years old, $name is studing $course")
}