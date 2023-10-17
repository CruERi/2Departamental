package Clases

class Mario (var vidas: Int = 3) {

    init {
        println("It's a me! Mario!")
    }
    private var state = "small"

    private fun die () {
        vidas--
        println("Has perdido una vida")
    }

    fun collision (Obj : String) {
        when(Obj){
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super Mario"
            "Fire Flower" -> state = "Fire Mario"
            else -> println("Unknown Object")
        }
    }
}