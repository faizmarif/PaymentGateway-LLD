package org.example.models.banks;

import java.util.UUID;

public class Bank {
  private String bankName;
  private String bankId;
  private double successRate;

  public Bank(String bankName) {
    this.bankName = bankName;
    this.bankId = UUID.randomUUID().toString();
    this.successRate = 0.8;
  }

  public Bank(String bankName, double successRate) {
    this.bankName = bankName;
    this.bankId = UUID.randomUUID().toString();
    this.successRate = successRate;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public double getSuccessRate() {
    return successRate;
  }

  public void setSuccessRate(double successRate) {
    this.successRate = successRate;
  }
}
