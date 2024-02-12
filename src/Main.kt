class BankAccount(
    private val accountNumber: String,
    private val ownerName: String,
    private var balance: Double = 0.0
) {

    fun deposit(amount: Double): Any {
        if (amount >= 0) {
            balance += amount
            return "${ownerName.capitalize()}, your balance is $balance. You have deposited $amount"
        } else {
            return "Try again"
        }
    }

    fun withdraw(amount: Double): Any {
        if (balance > 0 && balance >= amount) {
            balance -= amount
            return "${ownerName.capitalize()}, you have withdrawn $amount \nNow your Balance is $balance"
        } else {
            return "Your Balance is not enough to get $amount"
        }
    }

    fun checkBalance(): Any {
        return "${ownerName.capitalize()}, your balance is $balance"
    }


}


fun main() {


    print("Enter your name: ")
    var ownerName: String = readln()

    print("Enter your Account Number: ")
    var accountNumber: String = readln()


    var account = BankAccount(accountNumber, ownerName)


    while (true) {

        print("\nEnter your operation(deposit, withdraw, checkbalance) or type 'exit' to exit: ")
        val operation: String = readln().lowercase()

        if (operation == "deposit") {

            print("Enter the amount of your deposit: ")
            var amount: Double = readln().toDouble()
            println(account.deposit(amount))

        } else if (operation == "withdraw") {
            print("Enter your withdrawal amount: ")
            var amount: Double = readln().toDouble()
            println(account.withdraw(amount))
        }
        else if (operation == "checkbalance") { println(account.checkBalance())}
        else if (operation == "exit") {
            println("See you soon, ${ownerName.capitalize()}.")
            break
        }else{
            println("Incorrect. Try again")
        }

    }

}