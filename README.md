# Kotlin Bank Account Project

This Kotlin project implements a simple Bank Account class that allows users to perform basic operations like deposit, withdrawal, and checking the account balance.

## BankAccount Class

The `BankAccount` class represents a basic bank account with the following properties:

- `accountNumber`: String, private, uniquely identifies the account.
- `ownerName`: String, private, represents the name of the account owner.
- `balance`: Double, private, represents the current balance of the account.

### Methods

#### `deposit(amount: Double): Any`

This method allows the user to deposit a specified amount into the account. It checks if the amount is non-negative and updates the balance accordingly. It returns a message indicating the success or failure of the deposit.

#### `withdraw(amount: Double): Any`

This method allows the user to withdraw a specified amount from the account. It checks if the balance is sufficient for the withdrawal and updates the balance accordingly. It returns a message indicating the success or failure of the withdrawal.

#### `checkBalance(): Any`

This method returns a message indicating the current balance of the account.

## Usage

The `main` function in the code provides a simple command-line interface for users to interact with their bank account. It prompts the user for their name and account number, then enters into a loop where the user can perform operations such as deposit, withdrawal, check balance, and exit.

### Example Usage:

```kotlin
fun main() {
    // Prompt user for name and account number
    print("Enter your name: ")
    var ownerName: String = readLine() ?: ""

    print("Enter your Account Number: ")
    var accountNumber: String = readLine() ?: ""

    // Create BankAccount instance
    var account = BankAccount(accountNumber, ownerName)

    // Command-line interface loop
    while (true) {
        print("\nEnter your operation (deposit, withdraw, checkbalance) or type 'exit' to exit: ")
        val operation: String = readLine()?.toLowerCase() ?: ""

        when (operation) {
            "deposit" -> {
                print("Enter the amount of your deposit: ")
                var amount: Double = readLine()?.toDouble() ?: 0.0
                println(account.deposit(amount))
            }
            "withdraw" -> {
                print("Enter your withdrawal amount: ")
                var amount: Double = readLine()?.toDouble() ?: 0.0
                println(account.withdraw(amount))
            }
            "checkbalance" -> println(account.checkBalance())
            "exit" -> {
                println("See you soon, ${ownerName.capitalize()}.")
                break
            }
            else -> println("Incorrect. Try again")
        }
    }
}
