package org.example.models;

import org.example.models.paymodes.PaymodesType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
  private String clientName;
  private String clientId;
  private List<PaymodesType> supportedPaymodes;

  public Client(String clientName) {
    this.clientName = clientName;
    this.clientId = UUID.randomUUID().toString();
    supportedPaymodes = new ArrayList<>();
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public List<PaymodesType> getSupportedPaymodes() {
    return supportedPaymodes;
  }

  public void setSupportedPaymodes(List<PaymodesType> supportedPaymodes) {
    this.supportedPaymodes = supportedPaymodes;
  }
}
