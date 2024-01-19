package estore.services.interfaces.src.core.services;

public interface Provider {

    /**
     * Get the price of an item provided by this provider.
     *
     * @param item
     * @return
     */
    double getPrice(Object item) throws estorePojo.exceptions.UnknownItemException;

    /**
     * Emit an order for items. The provider returns the delay for delivering the
     * items.
     *
     * @param store the store that emits the order
     * @param item  the item ordered
     * @param qty   the quantity ordered
     * @return the delay (in hours)
     */
    int order(StoreImpl store, Object item, int qty) throws estorePojo.exceptions.UnknownItemException;
}
