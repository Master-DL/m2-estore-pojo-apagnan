package main;

import estore.services.interfaces.src.core.services.BankImpl;
import estore.services.interfaces.src.core.services.ClientImpl;
import estore.services.interfaces.src.core.services.ProviderImpl;
import estore.services.interfaces.src.core.services.StoreImpl;
import estore.services.interfaces.src.core.services.Provider;
import estore.services.interfaces.src.core.services.Bank;
import estore.services.interfaces.src.core.services.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new ProviderImpl();
		Bank bank = new BankImpl();
		Store store = new StoreImpl(prov,bank);
		ClientImpl cl = new ClientImpl(store);
		
		cl.run();

	}

}
