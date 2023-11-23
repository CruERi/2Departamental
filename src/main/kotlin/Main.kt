import Clases.*

fun main() {
    println ("-----------Telefono-----------------")
    var myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnON()
    myPhone.getTurn()

    println("---------Vehiculo-----------------")

    var myCar = Vehiculo("Lamborghini", "Veneno Roadster", "Grigio Metalluro", "EZCS-69")

    println("---")

    println("El vehículo está encendido? ${myCar.v_state}")
    myCar.turnVON()
    println("El vehículo está encendido? ${myCar.v_state}")

    println("---")

    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")
    myCar.recharge(20.07f)
    println("Cuánta gasolina tiene el vehículo: ${myCar.gasolina}")

    println("---")

    var vochoNegro = Vehiculo("VolksWagen", "Vocho")
    println("El color del Vocho es: ${vochoNegro.color}")

    println("---")

    var pointer = Vehiculo (
        color = "Azul",
        marca = "Volkswagen",
        modelo = "Pointer"
    )
    println("El color del Pointer es: ${pointer.color}")

    println("---------Persona-----------------")
    val people1 = Person (
        "Erick ",
        "Cruz ",
        "Masculino",
        1.70f
    )
    println("---------Mario-----------------")
    var player1 = Mario()
    player1.collision("Pipe")
    println("Vidas: ${player1.vidas}")
    player1.collision("Goomba")
    println("Vidas: ${player1.vidas}")
    println("---")

    // CLASE 17-10
    val player2 = Mario() // MAIN
    for (i in 1..5){
        if (player2.isAlive){
            player2.collision("Goomba")
            println("Te quedan ${player2.getLives()}")
        }

    }

    println("-------ENEMY-----------")

    val player3 = Mario()
    if (player3.isAlive){
        player3.collision("Goomba")
        println("Te quedan ${player3.getLives()}")
    }

    println("---")

    val player4 = Mario()
    player4.collision("Star")

    val newKoopa = Koopa() // MAIN
    newKoopa.collision("Weapon")
}
