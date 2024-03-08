import model.VendingMachine;
import state.IVendingMachineState;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(true, true, true);

        IVendingMachineState currentState = vendingMachine.getState();
        currentState.idleState(vendingMachine);
        currentState = vendingMachine.getState();
        currentState.dispensingState(vendingMachine);
    }
}