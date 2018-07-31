package br.com.microservice.template.config

import br.com.microservice.template.web.config.MicroserviceTemplateApplication
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(MicroserviceTemplateApplication::class)
open class MicroserviceTemplateApplicationTests
