package br.com.microservice.template.service

import junit.framework.TestCase.assertNotNull
import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

/**
 * Created by JoaoPedroCardoso on 31/07/18
 */
class ServiceTest {

    lateinit var testService: TestService

    @Before
    fun init() {
        testService = TestService()
    }

    @Test
    fun `call the hello service with success`() {
        val response = testService.hello("Yoda")
        assertNotNull(response)
        assertTrue(response.value == "Hello Yoda!")
    }

}
