//Базовый класс
class BaseOperator : MobileOperator
{
    constructor(name: String, cost: Double, area: Double) : super(name, cost, area)

    override fun printInfo()
    {
        println("Оператор: $name")
        println("Стоимость минуты: $costPerMin")
        println("Площадь покрытия: $coverageArea")
        println("Качество (Q): ${calculateQuality()}")
    }
}