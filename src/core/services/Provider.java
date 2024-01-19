package src.core.services;

import src.estorePojo.exceptions.*;

public interface Provider {

    /**
     * Get the price of an item provided by this provider.
     *
     * @param item
     * @return
     */
    double getPrice(Object item) throws UnknownItemException;

    /**
     * Emit an order for items. The provider returns the delay for delivering the
     * items.
     *
     * @param store the store that emits the order
     * @param item  the item ordered
     * @param qty   the quantity ordered
     * @return the delay (in hours)
     */
    int order(StoreImpl store, Object item, int qty) throws UnknownItemException;
}
