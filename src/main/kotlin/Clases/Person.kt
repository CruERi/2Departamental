package Clases

class Person (val name : String, val surname : String, val gender : String, val height : Float) {
    init {
        println("""
            Datos de la persona
            Nombre   : $name 
            Apellido : $surname
            Género   : $gender
            Altura   : $height
        """.trimIndent())
    }
}