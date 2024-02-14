package org.example.models.paymodes;

public class UPI extends Paymode{
  private String vpa;

  public UPI(PaymodesType modeType, String vpa) {
    super(modeType);
    this.vpa = vpa;
  }

  public String getVpa() {
    return vpa;
  }

  public void setVpa(String vpa) {
    this.vpa = vpa;
  }
}
