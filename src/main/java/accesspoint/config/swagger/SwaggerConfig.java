package accesspoint.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI openAPI(){
        return new OpenAPI()
            .servers(ServerList.toList())
            .info(null);
    }

    @Bean
    Info info(){
        return new Info()
        .version("test")
        .summary("test")
        .description("test");
    }
}
