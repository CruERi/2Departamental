package Clases

open class Enemy(val name: String, val strength: Int) { // NUEVA CLASE ENEMY

    init{
        println("Iniciando subclase de $name")
    }

    protected var direction : String = "L"

    protected fun changeDir(){
        direction = if (direction == "R") "L" else "R"
        println ("$name va en dirección $direction")
    }

    protected fun die(){
        println("$name ha muerto ")
    }

    open fun collision(collider: String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDir()
        }
    }
}