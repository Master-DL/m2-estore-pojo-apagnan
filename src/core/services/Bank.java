package src.core.services;
import src.estorePojo.exceptions.*;

public interface Bank {
    void transfert(String from, String to, double amount) throws InsufficientBalanceException, UnknownAccountException;
}
