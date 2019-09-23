package org.stummi.hellokotlin

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

data class Greeting(val greeting: String, val name: String, val fullSentence: String = "$greeting, $name!")

@Service
class HelloService(@Value("\${greeting:Hello}") val greeting: String) {
    fun greet(name: String) = Greeting(greeting, name)
}
