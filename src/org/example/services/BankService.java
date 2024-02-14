package org.example.services;

import org.example.models.banks.HDFC;
import org.example.models.banks.PNB;
import org.example.models.banks.SBI;
import org.example.models.paymodes.Paymode;
import java.util.Random;

public class BankService {
  private Random random;
  private SBI sbi;
  private HDFC hdfc;
  private PNB pnb;

  public BankService() {
    this.random = new Random();
    this.sbi = new SBI("SBI", 0.8);
    this.hdfc = new HDFC("HDFC", 0.9);
    this.pnb = new PNB("PNB", 0.6);
  }

  public void bankRouter(Paymode paymode, double amount) {
    int randomNum = random.nextInt(100) + 1;
    if(randomNum <= 50) {
      payInSBI(paymode, amount);
    } else if(randomNum <= 80) {
      payInHDFC(paymode, amount);
    } else {
      payInPNB(paymode, amount);
    }
  }

  private void payInSBI(Paymode paymode, double amount) { // 50%
    int randomNum = random.nextInt(10) + 1;
    if (randomNum <= sbi.getSuccessRate() * 10) {
      System.out.println("Payment successful at sbi of " + amount);
    } else {
      System.out.println("Payment failed at sbi of " + amount);
    }
  }

  private void payInHDFC(Paymode paymode, double amount) { // 30%
    int randomNum = random.nextInt(10) + 1;
    if (randomNum <= hdfc.getSuccessRate() * 10) {
      System.out.println("Payment successful at hdfc of " + amount);
    } else {
      System.out.println("Payment failed at hdfc of " + amount);
    }
  }

  private void payInPNB(Paymode paymode, double amount) { // 20%
    int randomNum = random.nextInt(10) + 1;
    if (randomNum <= pnb.getSuccessRate() * 10) {
      System.out.println("Payment successful at pnb of " + amount);
    } else {
      System.out.println("Payment failed at pnb of " + amount);
    }
  }
}
