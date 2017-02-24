package com.dkomo2.scholarshipconnect.config

import com.google.common.base.Predicates
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Created by david on 2/23/17.
 */

@Configuration
@EnableSwagger2
open class SwaggerConfig {
    @Bean
    open fun swaggerConfigDocket(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
    }

    private fun apiInfo(): ApiInfo {
        val apiInfo = ApiInfo(
                "Scholarship Connect",
                "",
                "v0.0.1",
                "",
                Contact("", "", ""),
                "",
                "")
        return apiInfo
    }
}