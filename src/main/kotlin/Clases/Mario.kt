package Clases
import java.util.*
import kotlin.concurrent.schedule

class Mario (var vidas: Int = 3) {

    init {
        println("It's a me! Mario!")
    }

    private var estad = "small" // CLASS MARIO
        set (value){
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if(value=="Star"){
                Timer("SettingUp", false).schedule(10000){
                    field = before
                    println("Tu estado ahora es $field")
                }
            }
            field = value
        }

    private var lives = 3

        set(value){ // CLASS MARIO 2
            if (field == 1){
                field = 0
                gameOver()
            } else if (field == 0){
                println("Necesitas volver a jugar")
            } else {
                field = value
            }
        }


    private fun die () {
        vidas--
        lives--
        println("Has perdido una vida")
    }

    fun getLives() :String { // CLASS MARIO 3
        return "$lives vidas"
    }

    private fun gameOver(){ // CLASS MARIO 4
        println("JUEGO TERMINADO")
    }

    val isAlive : Boolean // CLASS MARIO 5
        get(){
            return lives>=1
        }

    fun collision (Obj : String) {
        when(Obj){
            "Goomba" -> die()
            "Super Mushroom" -> estad = "Super Mario"
            "Fire Flower" -> estad = "Fire Mario"
            "Star" -> estad = "Star"
            else -> println("Unknown Object")
        }
    }
}