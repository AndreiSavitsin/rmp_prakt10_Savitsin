//Класс-потомок
class MobileOperatorWithConnectionFee : MobileOperator
{
    var hasConnectionFee: Boolean = false //P

    constructor(name: String, cost: Double, area: Double, fee: Boolean) : super(name, cost, area)
    {
        this.hasConnectionFee = fee
    }

    override fun calculateQuality(): Double {
        val Q = super.calculateQuality()
        return if (hasConnectionFee) 0.7 * Q else 1.5 * Q
    }

    override fun printInfo() {
        println("Оператор: $name")
        println("Стоимость минуты: $costPerMin")
        println("Площадь покрытия: $coverageArea")
        println("Качество (Q): ${calculateQuality()}")
        println("Наличие платы за соединение: ${if (hasConnectionFee) "Да" else "Нет"}")
        println("Качество с учетом P (Qp): ${calculateQuality()}")
    }
}