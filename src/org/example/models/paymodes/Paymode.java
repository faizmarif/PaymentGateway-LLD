package org.example.models.paymodes;

public class Paymode {
  private PaymodesType modeType;

  public Paymode(PaymodesType modeType) {
    this.modeType = modeType;
  }

  public PaymodesType getModeType() {
    return modeType;
  }

  public void setModeType(PaymodesType modeType) {
    this.modeType = modeType;
  }
}
