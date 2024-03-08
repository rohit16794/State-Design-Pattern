package model;

import state.IVendingMachineState;
import state.VendingMachineIdleState;

public class VendingMachine {

    private boolean isProductSelected;
    private boolean isMoneyInserted;
    private boolean isOperationSuccessful;

    private IVendingMachineState state = new VendingMachineIdleState();

    public VendingMachine(boolean isProductSelected, boolean isMoneyInserted, boolean isOperationSuccessful) {
        this.isProductSelected = isProductSelected;
        this.isMoneyInserted = isMoneyInserted;
        this.isOperationSuccessful = isOperationSuccessful;
    }

    public IVendingMachineState getState() {
        return state;
    }

    public void setState(IVendingMachineState state) {
        this.state = state;
    }


    public boolean isProductSelected() {
        return isProductSelected;
    }

    public void setProductSelected(boolean productSelected) {
        isProductSelected = productSelected;
    }

    public boolean isMoneyInserted() {
        return isMoneyInserted;
    }

    public void setMoneyInserted(boolean moneyInserted) {
        isMoneyInserted = moneyInserted;
    }

    public boolean isOperationSuccessful() {
        return isOperationSuccessful;
    }

    public void setIsOperationSuccessful(boolean operationSuccessful) {
        isOperationSuccessful = operationSuccessful;
    }
}
