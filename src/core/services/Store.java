package estore.services.interfaces.src.core.services;

import estore.services.interfaces.src.core.data.Cart;

public interface Store {

    /**
     * @param item  a given item
     * @return      the price of a given item
     * @throws estorePojo.exceptions.UnknownItemException
     */
    double getPrice( Object item ) throws estorePojo.exceptions.UnknownItemException;

    /**
     * @param item  a given item
     * @param qty   a given quantity
     * @return
     *      true if the given quantity of the given item is available
     *      directly from the store
     *      i.e. without having to re-order it from the provider
     */
    boolean isAvailable( Object item, int qty ) throws estorePojo.exceptions.UnknownItemException;

    /**
     * Add an item to a cart.
     * If the cart does not exist yet, create a new one.
     * This method is called for each item one wants to add to the cart.
     *
     * @param cart    a previously created cart or null
     * @param client
     * @param item
     * @param qty
     * @return
     *      Implementation dependant.
     *      Either a new cart at each call or the same cart updated.
     *
     * @throws estorePojo.exceptions.UnknownItemException
     * @throws MismatchClientCartException
     *      if the given client does not own the given cart
     */
    Cart addItemToCart(
            Cart cart,
            ClientImpl client,
            Object item,
            int qty )
            throws estorePojo.exceptions.UnknownItemException, estorePojo.exceptions.InvalidCartException;


    /**
     * Once all the items have been added to the cart,
     * this method finish make the payment
     *
     * @param cart
     * @param address
     * @param bankAccountRef
     * @return  the order
     *
     * @throws estorePojo.exceptions.UnknownItemException
     */
    Order pay( Cart cart, String address, String bankAccountRef )
            throws
            estorePojo.exceptions.InvalidCartException, estorePojo.exceptions.UnknownItemException,
            estorePojo.exceptions.InsufficientBalanceException, estorePojo.exceptions.UnknownAccountException;

    /**
     * Used by a client to order an item.
     * The whole process of ordering is encapsulated by this method.
     * If several items need to be ordered, this method needs to be
     * called several times, but the items will appear in separate orders.
     *
     * @param client
     * @param item
     * @param qty
     * @param address
     * @param bankAccountRef
     * @return  the order
     *
     * @throws estorePojo.exceptions.UnknownItemException
     * @throws estorePojo.exceptions.InsufficientBalanceException
     * @throws estorePojo.exceptions.UnknownAccountException
     */
    Order oneShotOrder(
            ClientImpl client,
            Object item,
            int qty,
            String address,
            String bankAccountRef
    )
            throws
            estorePojo.exceptions.UnknownItemException,
            estorePojo.exceptions.InsufficientBalanceException, estorePojo.exceptions.UnknownAccountException;

    /**
     * Treat an item ordered by a client and update the corresponding order.
     *
     * @param order
     * @param item
     * @param qty
     * @return
     *
     * @throws estorePojo.exceptions.UnknownItemException
     * @throws estorePojo.exceptions.InsufficientBalanceException
     * @throws estorePojo.exceptions.UnknownAccountException
     */
    void treatOrder( Order order, Object item, int qty ) throws estorePojo.exceptions.UnknownItemException;

    String toString();
}
