package org.stummi.hellokotlin

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class HelloController(val helloService: HelloService) {
    @GetMapping(path = ["hello/{name}"])
    fun helloWorld(@PathVariable("name") name: String) = helloService.greet(name)
}