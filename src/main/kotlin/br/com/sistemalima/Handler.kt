package br.com.sistemalima

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class Handler: RequestHandler<Map<String, String>, String> {

    override fun handleRequest(event: Map<String, String>, context: Context): String {
        return "Hello World"
    }
}