package src.core.data;

import src.core.services.ClientImpl;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    
    /** The client owning the cart. */
    private final ClientImpl client;
    
    /** The items currently added to the cart. key=item, value=quantity. */
    private Map<Object,Integer> items = new HashMap<>();
    
    
    public Cart(ClientImpl client) {
        this.client = client;
    }
    
    public void addItem( Object item, int qty ) {
        int oldQty = 0;
        if ( items.containsKey(item) ) {
            // The item has already been put in the cart
            // Increase the number
            oldQty = items.get(item);
        }
        items.put( item, qty+oldQty );
    }
    
    public Map getItems() {
        return items;
    }

	public ClientImpl getClient() {
		return client;
	}
}
