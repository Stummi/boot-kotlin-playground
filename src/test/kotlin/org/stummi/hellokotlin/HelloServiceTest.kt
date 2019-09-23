package org.stummi.hellokotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
internal class HelloServiceTest {
    @Autowired
    private lateinit var helloService: HelloService

    @Test
    fun `test simple greeting`() {
        var greeting = helloService.greet("World");
        Assert.assertEquals("World", greeting.name)
        Assert.assertEquals("Hello", greeting.greeting)
        Assert.assertEquals("Hello, World!", greeting.fullSentence)
    }
}