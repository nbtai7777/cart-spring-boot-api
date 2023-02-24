package sg.edu.ntu.cart_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.ntu.cart_api.helper.PaymentHelper;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class CartApiApplication {

	@Value("${MIN_PURCHASE}")
    float minimumPurchase; // This value will be injected from application.properties file  

	public static void main(String[] args) {
		SpringApplication.run(CartApiApplication.class, args);
	}

	@Bean
	public PaymentHelper paymentHelper(){
		return new PaymentHelper(minimumPurchase);
	}

}
