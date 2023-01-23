package Exercicios

fun main() {
    salary(7000.0f, 300.0f, 5f)
}
fun salary(salary: Float, hourlyRate: Float = 200.0f, workedTime: Float) : Float {
    return salary / hourlyRate * workedTime
}