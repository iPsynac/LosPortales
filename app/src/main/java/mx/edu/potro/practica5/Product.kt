package mx.edu.potro.practica5

data class Product(var name:String,
                   var image:Int?,
                   var description:String,
                   var price:Double) {
    constructor(name: String, description: String, price: Double) : this(name, null, description, price)
}

