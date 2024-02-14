package org.example.services;

import org.example.models.Client;
import org.example.models.paymodes.Paymode;
import org.example.models.paymodes.PaymodesType;

public interface PG {

  void addClient(Client client); // add a client in PG

  void removeClient(Client client); // remove client from PG

  boolean hasClient(Client client); // does a client exist in the PG?

  void listSupportedPaymodes(); // for PG

  void listSupportedPaymodes(
      Client client); // show paymodes support by PG. if a client is passed as parameter, all supported paymodes for the clients should be shown.

  void addSupportForPaymode(PaymodesType paymode);

  void addSupportForPaymode(Client client,
      PaymodesType paymode); // add paymodes support in the PG. If a client is passed as parameter, add paymode for the clients.

  void removePaymode(PaymodesType paymode);

  void removePaymode(Client client,
      PaymodesType paymode); // remove paymode ( both from PG or client basis parameter)

  void showDistribution(); //show active distribution percentage of router

  void makePayment(Client client, Paymode mode, double amount);

}
