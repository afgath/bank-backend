package co.com.coomeva.devops.bank.dto;

public class DepositDTO {

	private String accoId;
	private Double amount;
	private String userEmail;

	public DepositDTO(String accoId, Double amount, String userEmail) {
		super();
		this.accoId = accoId;
		this.amount = amount;
		this.userEmail = userEmail;
	}

	public DepositDTO() {
		super();
	}

	public String getAccoId() {
		return accoId;
	}

	public void setAccoId(String accoId) {
		this.accoId = accoId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
