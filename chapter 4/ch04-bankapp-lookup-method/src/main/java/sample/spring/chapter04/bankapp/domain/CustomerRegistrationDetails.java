package sample.spring.chapter04.bankapp.domain;

import org.apache.log4j.Logger;

@SuppressWarnings("unused")
public class CustomerRegistrationDetails {
	private static Logger logger = Logger
			.getLogger(CustomerRegistrationDetails.class);
	private String accountNumber;
	private String address;
	private String cardNumber;

	public CustomerRegistrationDetails() {
		logger.info("Created CustomerRegistrationDetails instance");
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
