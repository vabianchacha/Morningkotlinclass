
open class shape{
    open fun draw(){
        println("drawing a shape")
    }
}

class Rhombus: shape() {
    override fun draw(){
        println("drawing a Rhombus")
    }
}

class parallelogram{
    fun draw(){
        println("drawing a parallelogram")
    }
}


fun main() {
    var s = shape()
    s.draw()
    var r = Rhombus()
    r.draw()
    var p = parallelogram()
    p.draw()
}