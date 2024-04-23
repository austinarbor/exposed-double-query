package dev.aga

import dev.aga.entity.Parent
import org.jetbrains.exposed.dao.load
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class App

fun main(args: Array<String>) {
  SpringApplication.run(App::class.java, *args)
}

@Component
class Runner : CommandLineRunner {
  override fun run(vararg args: String?) {
    val parent = transaction {
      Parent.findById(1L)?.load(Parent::children)
    }
  }
}
