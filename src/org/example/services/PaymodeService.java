package org.example.services;

import org.example.models.paymodes.CreditCard;
import org.example.models.paymodes.NetBanking;
import org.example.models.paymodes.UPI;

public class PaymodeService {
  private BankService bankService;

  public PaymodeService() {
    this.bankService = new BankService();
  }

  public void payByUPI(UPI upi, double amount) {
    // validate credentials
    bankService.bankRouter(upi, amount);
  }

  public void payByNetBanking(NetBanking banking, double amount) {
    // validate credentials
    bankService.bankRouter(banking, amount);
  }

  public void payByCreditCard(CreditCard card, double amount) {
    // validate credential
    bankService.bankRouter(card, amount);
  }
}
