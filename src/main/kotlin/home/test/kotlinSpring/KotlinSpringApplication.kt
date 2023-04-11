package home.test.kotlinSpring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.map.repository.config.EnableMapRepositories

@SpringBootApplication
@EnableMapRepositories
@EnableJpaRepositories
class KotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringApplication>(*args)
}
