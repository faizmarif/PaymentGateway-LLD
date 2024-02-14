package org.example;

import org.example.models.Client;
import org.example.models.paymodes.PaymodesType;
import org.example.models.paymodes.UPI;
import org.example.services.RazorpayPG;

public class Main {
  public static void main(String[] args) {
    RazorpayPG pg = new RazorpayPG();
    Client flipkart = new Client("Flipkart");
    pg.addClient(flipkart);
    //System.out.println(pg.hasClient(flipkart));
    pg.removeClient(flipkart);
    //System.out.println(pg.hasClient(flipkart));
    pg.addClient(flipkart);


    //pg.listSupportedPaymodes();
    pg.addSupportForPaymode(PaymodesType.UPI);
    pg.addSupportForPaymode(PaymodesType.CREDIT_CARD);
    pg.addSupportForPaymode(PaymodesType.NET_BANKING);
    //pg.listSupportedPaymodes();
    //pg.removePaymode(PaymodesType.UPI);
    //pg.listSupportedPaymodes();

    //pg.listSupportedPaymodes(flipkart);
    pg.addSupportForPaymode(flipkart, PaymodesType.UPI);
    pg.addSupportForPaymode(flipkart, PaymodesType.CREDIT_CARD);
    pg.addSupportForPaymode(flipkart, PaymodesType.NET_BANKING);
    //pg.listSupportedPaymodes(flipkart);
    //pg.removePaymode(flipkart, PaymodesType.UPI);
    //pg.listSupportedPaymodes(flipkart);

    UPI myUpi = new UPI(PaymodesType.UPI, "977157@ybl");
    for(int i=0;i<100;i++)
    pg.makePayment(flipkart, myUpi, 2000);



  }
}
