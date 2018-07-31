package br.com.microservice.template.web.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = ["br.com.microservice.template", "br.com.microservice.template.service"])
@EntityScan(basePackages = ["br.com.microservice.template.model"])
@EnableAutoConfiguration
open class MicroserviceTemplateApplication

fun main(args: Array<String>) {
    runApplication<MicroserviceTemplateApplication>(*args)
}
