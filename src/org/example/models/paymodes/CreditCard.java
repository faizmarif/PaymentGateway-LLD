package org.example.models.paymodes;

public class CreditCard extends Paymode {
  private String cardNum;
  private String expiry;
  private String cvv;

  public CreditCard(PaymodesType modeType, String cardNum, String expiry, String cvv) {
    super(modeType);
    this.cardNum = cardNum;
    this.expiry = expiry;
    this.cvv = cvv;
  }

  public String getCardNum() {
    return cardNum;
  }

  public void setCardNum(String cardNum) {
    this.cardNum = cardNum;
  }

  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
