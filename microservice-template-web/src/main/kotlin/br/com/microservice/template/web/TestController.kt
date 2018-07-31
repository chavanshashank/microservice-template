package br.com.microservice.template.web

import br.com.microservice.template.api.TestApi
import br.com.microservice.template.api.representation.TestRepresentation
import br.com.microservice.template.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */
@RestController
class TestController @Autowired constructor(private val testService: TestService) : TestApi {

    override fun hello(@PathVariable(value = "name") name: String) = TestRepresentation(testService.hello(name).value)

    override fun helloPut(@PathVariable(value = "name") name: String) = TestRepresentation(testService.hello(name)
        .value)
}
