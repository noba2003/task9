//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var manager: Employee = Manager("HR", "ahmed", EMP.Manager.toString(), 25)
    var developer: Employee = Developer(Programming.kotlin.toString(), "ali", EMP.Developer.toString(), 365)
    Employee.printDetails(manager)
    Employee.printDetails(developer)
    println("------------")
    manager.work()
    manager.report()

    println("------------")
 developer.work()
    developer.work()
    println("------------")
    manager.details()
    developer.details()
    println("------------")
    //sealed Class
    var managerSealed =sealed.Manager("it", "ahmed", EMP.Manager.toString(), 65)
    var developerSealed =sealed.Developer(Programming.java.toString(), "amer", EMP.Developer.toString(), 45)

    managerSealed.work()
    managerSealed.report()
    developerSealed.work()
    developerSealed.report()
}

fun Employee.details() {
    when (this) {
        is Manager -> {
            println(this.work())
            println(this.report())
        }

        is Developer -> {
            println(this.work())
            println(this.report())
        }


    }

}