//Абстрактный класс
abstract class MobileOperator : Quality
{
    var name: String = ""
    var costPerMin: Double = 0.0
    var coverageArea: Double = 0.0

    constructor(name: String, cost: Double, area: Double)
    {
        this.name = name
        this.costPerMin = cost
        this.coverageArea = area
    }

    override fun calculateQuality(): Double {
        return if (costPerMin > 0) 100 * coverageArea / costPerMin else 0.0
    }
}