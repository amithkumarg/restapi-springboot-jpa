package com.oss.shop.controller;

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AnimalController {

    @GetMapping("/animals")
    @ApiOperation(value = "Get Pet Animals")
    fun getPets(): List<Animal> {
        return listOf(Cat("Jasper", true))
    }
}


@ApiModel(description = "Describes animal", subTypes = [Cat::class, Dog::class], discriminator = "type")
public abstract class Animal(
    open var id: String? = null,
    open var name: String? = null
)

@ApiModel(description = "Describe cat", parent = Animal::class, value = "Cat")
public data class Cat(
    override var name: String?,
    val pet: Boolean
) : Animal()


@ApiModel(description = "Describe dog", parent = Animal::class, value = "Dog")
public data class Dog(
    override var name: String?,
    val breed: String
) : Animal()
