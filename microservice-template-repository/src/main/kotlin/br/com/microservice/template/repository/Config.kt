package br.com.microservice.template.repository

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import java.text.ParseException

/**
 * Created by JoaoPedroCardoso on 11/05/18
 */
@Configuration
@Profile("dev")
open class Config {

    /*@Autowired
    private val dbService: DbService? = null*/

    @Value("\${spring.jpa.hibernate.ddl-auto}")
    private val strategy: String? = null

    @Bean
    @Throws(ParseException::class)
    open fun instantiateDatabase(): Boolean {

        if ("create" != strategy) {
            return false
        }

        //dbService!!.instantiateTestDatabase()

        return true
    }

}