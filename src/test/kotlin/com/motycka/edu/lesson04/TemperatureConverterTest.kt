package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class TemperatureConverterTest : StringSpec({

    "32°F should convert to 0°C" {
        // given
        val f = 32.0

        // when
        val c = TemperatureConverter.toCelsius(f)

        // then
        c shouldBe 0.0
    }

    "212°F should convert to 100°C" {
        val f = 212.0
        TemperatureConverter.toCelsius(f) shouldBe 100.0
    }

    "98.6°F should convert to approximately 37°C" {
        TemperatureConverter.toCelsius(98.6) shouldBe (37.0 plusOrMinus 0.1)
    }

    "−40°F should convert to −40°C" {
        TemperatureConverter.toCelsius(-40.0) shouldBe -40.0
    }

    "very large Fahrenheit values still convert correctly" {
        val f = 1e4
        val expected = (f - 32) * 5.0 / 9.0
        TemperatureConverter.toCelsius(f) shouldBe (expected plusOrMinus 1.0)
    }

    "round‑trip C → F → C returns the original" {
        val originalC = 25.0
        val roundTrip = TemperatureConverter.toCelsius(
            TemperatureConverter.toFahrenheit(originalC)
        )
        roundTrip shouldBe (originalC plusOrMinus 0.1)
    }
})
