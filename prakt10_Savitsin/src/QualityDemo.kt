//Класс для интерфейса
class QualityDemo : Quality {
    override fun printInfo() {
        println("Демонстрация работы интерфейса")
    }

    override fun calculateQuality(): Double {
        return  0.0
    }
    fun showQuality(obj: Quality)
    {
        println("Качество объекта: ${obj.calculateQuality()}")
    }
}