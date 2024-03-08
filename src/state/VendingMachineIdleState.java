package state;

import model.VendingMachine;

public class VendingMachineIdleState implements IVendingMachineState {

    @Override
    public void idleState(VendingMachine vendingMachine) {
        if(vendingMachine.isProductSelected()) {
            System.out.println("The product is selected, setting it to selection state");
            vendingMachine.setState(new VendingMachineSelectionState());
        } else {
            System.out.println("The product is not selected, operation aborted.");
        }
    }

    @Override
    public void selectionMadeState(VendingMachine vendingMachine) {
        System.out.println("The machine is in idle state, invalid operation");
    }

    @Override
    public void processingState(VendingMachine vendingMachine) {
        System.out.println("The machine is in idle state, invalid operation");
    }

    @Override
    public void dispensingState(VendingMachine vendingMachine) {
        System.out.println("The machine is in idle state, invalid operation");
    }
}
