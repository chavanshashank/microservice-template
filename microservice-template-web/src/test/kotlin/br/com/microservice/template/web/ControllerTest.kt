package br.com.microservice.template.web

import br.com.microservice.template.ControllerBaseTest
import br.com.microservice.template.api.TestApi
import br.com.microservice.template.infrastructe.extension.jsonToObject
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import org.springframework.http.MediaType
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders
import org.springframework.restdocs.payload.PayloadDocumentation
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import kotlin.test.assertTrue

/**
 * Created by JoaoPedroCardoso on 31/07/18
 */
class ControllerTest: ControllerBaseTest() {

    @Test
    fun getOperationOnHello() {
        val response = this.mockMvc.perform(
            RestDocumentationRequestBuilders.get(TestApi.HELLO_BASE_URL, "Yoda")
        )
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andDo(MockMvcResultHandlers.print())
            .andDo(
                documentationHandler.document(
                    PayloadDocumentation.responseFields(
                        PayloadDocumentation.fieldWithPath("value").description("The value of hello message").type
                            ("String")
                    )
                )
            )
            .andReturn()
        assertNotNull(response)
        val helloTest = response.response.contentAsString.jsonToObject(br.com.microservice.template.model.Test::class
            .java
        )
        assertTrue(helloTest.value == "Hello Yoda!")
    }

    @Test
    fun putOperationOnHello() {
        val response = this.mockMvc.perform(
            RestDocumentationRequestBuilders.put(TestApi.HELLO_BASE_URL, "Yoda")
        )
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andDo(MockMvcResultHandlers.print())
            .andDo(
                documentationHandler.document(
                    PayloadDocumentation.responseFields(
                        PayloadDocumentation.fieldWithPath("value").description("The value of hello message").type
                            ("String")
                    )
                )
            )
            .andReturn()
        assertNotNull(response)
        val helloTest = response.response.contentAsString.jsonToObject(br.com.microservice.template.model.Test::class
            .java
        )
        assertTrue(helloTest.value == "Hello Yoda!")
    }

}
