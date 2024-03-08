Source : ChatGPT
Let's consider a simple vending machine. The vending machine can have different states such as "Idle", "Selection Made", "Processing", and "Dispensing". 
Each state has its own behavior and transitions.

The vending machine can transition between states based on user actions. For example:

From "Idle" state, if a user selects a product, it transitions to "Selection Made" state.
From "Selection Made" state, if the user inserts money, it transitions to "Processing" state.
From "Processing" state, if the transaction is successful, it transitions to "Dispensing" state, otherwise, it transitions back to "Idle" state.
Your task is to implement the state design pattern to model this vending machine system.