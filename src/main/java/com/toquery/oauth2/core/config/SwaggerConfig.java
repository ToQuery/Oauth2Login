package com.toquery.oauth2.core.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableSwagger
public class SwaggerConfig {
    @Autowired
    private SpringSwaggerConfig springSwaggerConfig;


    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {
        SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
        swaggerSpringMvcPlugin.apiInfo(apiInfo());
        swaggerSpringMvcPlugin.includePatterns(".*?");
        return swaggerSpringMvcPlugin;
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("APP标题", "APP描述", "My Apps API terms of service", "toquery@qq.com", null, null);
//                "My Apps API Licence Type",
//                "My Apps API License URL"

        return apiInfo;
    }
}
