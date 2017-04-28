//package bank
//import io.StdIn._
//
//object BankMain {
//  def main(args: Array[String]): Unit = {
//    val bank = new Bank
//    var option = 0
//    var customer: Option[Customer] = None
//    var account: Option[Account] = None
//
//    while (option != 10) {
//      println(menu)
//      option = readInt()
//      option match {
//        case 1 => customer = Some(createCustomer(bank))
//        case 2 => customer = selectCustomer(Bank)
//        case 3 =>
//        case 4 =>
//        case 6 =>
//        case 7 =>
//        case 8 =>
//        case 9 =>
//        case 10 =>
//        case _ =>
//
//      }
//    }
//
//  }
//
//  private def createCustomer(bank: Bank): Customer = {
//    println("What is the customer's first name?")
//    var firstName = readLine()
//    println("What is the customer's last name?")
//    var lastName = readLine()
//    println("What is the customer's address")
//    var address = readAddress()
//    bank.addCustomer(firstName, lastName, address)
//  }
//
//  private def selectCustomer(bank: Bank): Option[Customer] = {
//    println("Do you want to find the customer by name or id? (name/id)")
//    val option = readLine()
//    if (option == "name") {
//      println("What is the customer's first name?")
//      var firstName = readLine()
//      println("What is the customer's last name?")
//      var lastName = readLine()
//      bank.findCustomer(firstName, lastName)
//    } else {
//      println("What is the customer's id?")
//      val id = readLine()
//      bank.findCustomer(id)
//    }
//
//  }
//
//  private def readAddress(): Address = {
//    ???
//  }
//
//  private var menu = """Select one of the following options:
//1. Create customer
//2. Select customer
//3. Create account
//4. Close account
//5. Select account
//6. Deposit to account
//7. Withdraw from account
//8. Check account balance
//9. Change address
//"""
//
//}