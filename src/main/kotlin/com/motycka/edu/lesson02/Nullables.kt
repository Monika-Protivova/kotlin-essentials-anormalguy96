package com.motycka.edu.lesson02

fun main() {
    val name: String = "John"               // cannot be null
    val nullableName: String? = null         // can be null

    val lengthOrNull: Int? = nullableName?.length
    println("Length of nullableName (safe call): \$lengthOrNull")

    val safeLength: Int = nullableName?.length ?: 0
    println("Length of nullableName (Elvis default): \$safeLength")

    try {
        val assertedLength = nullableName!!.length
        println("Length via not-null assertion: \$assertedLength")
    } catch (e: NullPointerException) {
        println("Caught NPE from not-null assertion: \${e.message}")
    }

    val upper: String? = nullableName?.uppercase()
    println("Uppercase of nullableName: \$upper")

    val actualName: String? = "Alice"
    println("ActualName uppercase: \${actualName?.uppercase() ?: "UNKNOWN"}")
}
// I hopefully anticipate it to pass the requirements
