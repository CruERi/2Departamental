package Clases

class Phone {
    var isOn = false
    lateinit var model:String

    fun turnON(){
        isOn = true
    }

    fun turnOFF(){
        isOn = false
    }

    fun getTurn() {
        val turnMode = if (isOn) "Encendido" else "Apagado"
        println("El teléfono está $turnMode")
    }
}