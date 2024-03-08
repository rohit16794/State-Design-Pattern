package state;

import model.VendingMachine;

public class VendingMachineSelectionState implements IVendingMachineState {
    @Override
    public void idleState(VendingMachine vendingMachine) {
        System.out.println("Machine is in selection state, invalid operation");
    }

    @Override
    public void selectionMadeState(VendingMachine vendingMachine) {
        if(vendingMachine.isMoneyInserted()) {
            vendingMachine.setState(new VendingMachineProcessingState());
        } else {
            System.out.println("Add money bruh, nothing is free!");
        }
    }

    @Override
    public void processingState(VendingMachine vendingMachine) {
        System.out.println("Machine is in selection state, invalid operation");
    }

    @Override
    public void dispensingState(VendingMachine vendingMachine) {
        System.out.println("Machine is in selection state, invalid operation");
    }
}
