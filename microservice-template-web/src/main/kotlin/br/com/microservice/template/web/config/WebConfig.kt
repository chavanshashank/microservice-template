package br.com.microservice.template.web.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Created by JoaoPedroCardoso on 29/07/18
 */
@Configuration
@EnableWebMvc
open class WebConfig: WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry){
        registry.addMapping("/**")
            .allowCredentials(true)
            .allowedHeaders("*")
            .allowedMethods("*")
            .allowedOrigins("*")
            .maxAge(3600L)
    }
}
