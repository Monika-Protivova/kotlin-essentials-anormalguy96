package com.motycka.edu.lesson04

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger { }

object TemperatureConverter {
    fun toCelsius(fahrenheit: Double): Double {
        logger.info { "Converting $fahrenheit Fahrenheit to Celsius" }
        return (fahrenheit - 32) * 5 / 9
    }
    fun toFahrenheit(celsius: Double): Double {
        logger.info { "Converting $celsius Celsius to Fahrenheit" }
        return celsius * 9 / 5 + 32
    }

}


fun main() {
    TemperatureConverter.toFahrenheit(34.0).also(::println)
    TemperatureConverter.toCelsius(94.0).also(::println)
}
