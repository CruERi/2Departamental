package Clases

class Vehiculo (var marca : String, var modelo : String, val color : String = "Negro"){

    init {
        println("Los datos del vehículo son:" +
                "\ncolor: $color" +
                "\nmarca: $marca" +
                "\nmodelo: $modelo")
    }

    constructor(marca : String, modelo : String, color : String, placas : String) : this(marca, modelo, color){
        this.placas = placas
        println("placas: ${this.placas}")
    }

    var placas = ""
    var gasolina = 0f
    var v_state = false

    fun turnVON (){
        v_state = true
    }
    fun turnVOFF(){
        v_state = false
    }
    fun recharge(litros : Float){
        gasolina+=litros
    }

}