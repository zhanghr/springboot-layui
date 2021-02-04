package com.haiyu.manager.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.collect.Lists;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfigs {

	@Bean(value = "preparation")
	@Order(value = 1)
	public Docket groupRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("preparation")
				.apiInfo(groupApiInfo()).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(ConTagModel.class)).paths(PathSelectors.any())

				.build().securityContexts(Lists.newArrayList(securityContext()))
				.securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey(), apiKey1(), apiKey2()));
	}

	private ApiInfo groupApiInfo() {
		return new ApiInfoBuilder().title("数据查询便民中心")
				.description("<div style='font-size:14px;color:red;'>preparation-manage-api</div>")
				.termsOfServiceUrl("localhost:8426/app-preparation-manage").version("1.0").build();
	}

	private ApiKey apiKey() {
		return new ApiKey("Authorization", "Authorization", "header");
	}

	private ApiKey apiKey1() {
		return new ApiKey("K1", "K1", "header");
	}
	
	private ApiKey apiKey2() {
		return new ApiKey("K2", "K2", "header");
	}


	private SecurityContext securityContext() {
		return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/.*")).build();
	}

	

	List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Lists.newArrayList(new SecurityReference("Authorization", authorizationScopes));
	}

	

}
