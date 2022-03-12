package co.edu.eafit.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BankTransactionApplication {

	/*
	 * // Acceder a la variable del properties
	 * 
	 * @Value("${otp.service.validate.url}") private String otpServiceValidateUrl;
	 */

	public static void main(String[] args) {
		SpringApplication.run(BankTransactionApplication.class, args);
	}

	/*
	 * // Activar WebClient en este proyecto
	 * 
	 * @Bean public WebClient otpWebClient() { return
	 * WebClient.builder().baseUrl(otpServiceValidateUrl).build(); }
	 */

}
