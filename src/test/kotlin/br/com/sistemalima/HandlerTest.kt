package br.com.sistemalima

import io.mockk.impl.annotations.MockK
import io.quarkus.test.InjectMock
import com.amazonaws.services.lambda.runtime.Context
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

internal class HandlerTest {

    @InjectMock
    private val handler: Handler = Handler()

    @MockK(relaxed = true)
    private lateinit var contex: Context

    @Test
    fun `deve retornar hello world`() {

        val event = mapOf(
            "productCode" to "12345",
            "chpras" to "124"
        )


        val result = assertDoesNotThrow {
            handler.handleRequest(event, contex)
        }

        Assertions.assertTrue(result == "Hello World")
    }
}