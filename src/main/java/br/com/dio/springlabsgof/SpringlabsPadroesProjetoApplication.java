package br.com.dio.springlabsgof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringlabsPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlabsPadroesProjetoApplication.class, args);
	}

}
