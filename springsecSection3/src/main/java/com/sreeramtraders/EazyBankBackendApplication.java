package com.sreeramtraders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*
If the model and repositry packages are not inside the main package. Then mention those package name with below annotations.
@EnableJpaRepositories("com.sreeramtraders.repository")
@EntityScan("com.sreeramtraders.model")*/
public class EazyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankBackendApplication.class, args);
	}

}
