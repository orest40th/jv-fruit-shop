package core.basesyntax.service.Operation;

import core.basesyntax.dao.StorageDaoImpl;

public class BalanceHandler implements OperationHandler {
    @Override
    public void handle(String fruit, int amount) {
        StorageDaoImpl.addProduct(fruit, amount);
    }
}
