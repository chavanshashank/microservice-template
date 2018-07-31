package br.com.microservice.template.infrastructe.instantiation

import org.springframework.stereotype.Service
import java.text.ParseException

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */

@Service
class DbService {

    @Throws(ParseException::class)
    fun instantiateTestDatabase() {
        //If you need to, create an initial load for the database here
    }
}
