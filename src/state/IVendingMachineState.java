package state;

import model.VendingMachine;

public interface IVendingMachineState {
    void idleState(VendingMachine vendingMachine);

    void selectionMadeState(VendingMachine vendingMachine);

    void processingState(VendingMachine vendingMachine);

    void dispensingState(VendingMachine vendingMachine);
}
