package com.agilefreaks.kmmapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}