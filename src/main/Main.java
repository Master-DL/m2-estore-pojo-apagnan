package src.main;

import src.core.services.*;

public class Main {

	public static void main(String[] args) {
		Provider prov = new ProviderImpl();
		Bank bank = new BankImpl();
		StoreClientView store = new StoreImpl(prov,bank);
		ClientImpl cl = new ClientImpl(store);
		
		cl.run();

	}

}
