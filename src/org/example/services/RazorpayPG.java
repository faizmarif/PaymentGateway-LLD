package org.example.services;

import org.example.models.Client;
import org.example.models.banks.Bank;
import org.example.models.paymodes.CreditCard;
import org.example.models.paymodes.NetBanking;
import org.example.models.paymodes.Paymode;
import org.example.models.paymodes.PaymodesType;
import org.example.models.paymodes.UPI;
import java.util.*;

public class RazorpayPG implements PG {
  private Map<String, Client> clientIdMap;
  private List<PaymodesType> supportedPaymodesByPG;
  private List<Bank> integratedBanksByPG;
  private PaymodeService paymodeService;

  public RazorpayPG() {
    this.paymodeService = new PaymodeService();
    this.clientIdMap = new HashMap<>();
    this.supportedPaymodesByPG = new ArrayList<>();
    this.integratedBanksByPG = new ArrayList<>();
  }

  @Override
  public void addClient(Client client) {
    clientIdMap.put(client.getClientId(), client);
  }

  @Override
  public void removeClient(Client client) {
    clientIdMap.remove(client.getClientId());
  }

  @Override
  public boolean hasClient(Client client) {
    return clientIdMap.containsKey(client.getClientId());
  }

  @Override
  public void listSupportedPaymodes() {
    for(PaymodesType mode : supportedPaymodesByPG) {
      System.out.println(mode.name());
    }
  }

  @Override
  public void listSupportedPaymodes(Client client) {
    for(PaymodesType mode : client.getSupportedPaymodes()) {
      System.out.println(mode.name());
    }
  }

  @Override
  public void addSupportForPaymode(PaymodesType paymode) {
    supportedPaymodesByPG.add(paymode);
  }

  @Override
  public void addSupportForPaymode(Client client, PaymodesType paymode) {
    client.getSupportedPaymodes().add(paymode);
  }

  @Override
  public void removePaymode(PaymodesType paymode) {
    supportedPaymodesByPG.remove(paymode);
  }

  @Override
  public void removePaymode(Client client, PaymodesType paymode) {
    client.getSupportedPaymodes().remove(paymode);
  }

  @Override
  public void showDistribution() {
    // change it
    for (Bank bank : integratedBanksByPG) {
      System.out.println(bank.getBankName() + " : " + bank.getSuccessRate());
    }
  }

  @Override
  public void makePayment(Client client, Paymode mode, double amount) {
    if(mode.getModeType().equals(PaymodesType.UPI) && client.getSupportedPaymodes().contains(mode.getModeType())) {
      paymodeService.payByUPI((UPI) mode, amount);
    }else if(mode.getModeType().equals(PaymodesType.NET_BANKING) && client.getSupportedPaymodes().contains(mode.getModeType())) {
      paymodeService.payByNetBanking((NetBanking) mode, amount);
    }else if(mode.getModeType().equals(PaymodesType.CREDIT_CARD) && client.getSupportedPaymodes().contains(mode.getModeType())) {
      paymodeService.payByCreditCard((CreditCard) mode, amount);
    }
  }
}
