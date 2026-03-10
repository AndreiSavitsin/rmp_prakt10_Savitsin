fun main()
{
    println("Операторы связи\n")

    //Создание объектов

    //Базовые
    val op1 = BaseOperator("Мотив", 2.5, 1000.0)
    val op2 = BaseOperator("Билайн", 1.8, 800.0)
    val op3 = BaseOperator("МТС", 3.0, 1200.0)

    //Потомки
    val op4 = MobileOperatorWithConnectionFee("TELE2", 1.5, 500.0, true)
    val op5 = MobileOperatorWithConnectionFee("Йота", 2.0, 300.0, false)
    val op6 = MobileOperatorWithConnectionFee("Ростелеком", 1.0, 400.0, true)

    println("Базовые\n")
    op1.printInfo()
    println()
    op2.printInfo()
    println()
    op3.printInfo()
    println()

    println("Потомки\n")
    op4.printInfo()
    println()
    op5.printInfo()
    println()
    op6.printInfo()
    println()

    println("Демо\n")
    val demo = QualityDemo()
    demo.printInfo()
    demo.showQuality(op1)
    demo.showQuality(op4)
}