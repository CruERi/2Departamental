package Clases

class Koopa: Enemy ("Koopa", 2){
    open override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                val state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDir()
        }
    }

}