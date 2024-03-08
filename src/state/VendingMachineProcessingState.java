package state;

import model.VendingMachine;

public class VendingMachineProcessingState implements IVendingMachineState {

    @Override
    public void idleState(VendingMachine vendingMachine) {
        System.out.println("Invalid operation, machine is in processing state");
    }

    @Override
    public void selectionMadeState(VendingMachine vendingMachine) {
        System.out.println("Invalid operation, machine is in processing state");
    }

    @Override
    public void processingState(VendingMachine vendingMachine) {
        if(vendingMachine.isOperationSuccessful()) {
            System.out.println("Operation successful, moving machine to dispensing state");
            vendingMachine.setState(new VendingMachineDispensingState());
        } else {
            System.out.println("Operation not successful, moving machine back to idle state");
            vendingMachine.setState(new VendingMachineIdleState());
        }
    }

    @Override
    public void dispensingState(VendingMachine vendingMachine) {
        System.out.println("Invalid operation, machine is in processing state");
    }
}
