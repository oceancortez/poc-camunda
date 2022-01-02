package org.omc.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @implNote <b>Swagger Configuration</b>
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Camunda Noodles Service")
                        .version("v1.0.0")
                        .description("We will try to cook veg masala instant noodles using Springboot Camunda Workflow.")
                        .termsOfService("Terms of Service"));

    }


}