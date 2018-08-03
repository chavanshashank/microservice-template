package br.com.microservice.template

import br.com.microservice.template.config.MicroserviceTemplateApplicationTests
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.restdocs.JUnitRestDocumentation
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler
import org.springframework.restdocs.operation.preprocess.Preprocessors
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext


/**
 * Created by JoaoPedroCardoso on 31/07/18
 */
@WebAppConfiguration
@SpringBootTest
@RunWith(SpringRunner::class)
@ContextConfiguration(classes = [(MicroserviceTemplateApplicationTests::class)])
abstract class ControllerBaseTest {

    @Rule
    @JvmField
    val restDocumentation = JUnitRestDocumentation("target/generated-snippets")

    lateinit var documentationHandler: RestDocumentationResultHandler

    @Autowired
    private lateinit var context: WebApplicationContext

    protected lateinit var mockMvc: MockMvc

    @Before
    fun setUp() {
        documentationHandler = MockMvcRestDocumentation.document(
            "{method-name}",
            Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
            Preprocessors.preprocessResponse(Preprocessors.prettyPrint())
        )
        mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
            .apply<DefaultMockMvcBuilder>(MockMvcRestDocumentation.documentationConfiguration(this.restDocumentation))
            .alwaysDo<DefaultMockMvcBuilder>(this.documentationHandler)
            .build()
    }


}