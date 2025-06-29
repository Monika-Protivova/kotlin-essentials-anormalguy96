package com.motycka.edu.lesson04

object TemperatureConverter {

    fun toFahrenheit(celsius: Double): Double =
        celsius * 9.0 / 5.0 + 32.0

    fun toCelsius(fahrenheit: Double): Double =
        (fahrenheit - 32.0) * 5.0 / 9.0
}
