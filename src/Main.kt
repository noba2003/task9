//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listOfEmployee = mutableListOf<Employee>()
    val manager: Employee = Manager("HR", "ahmed", EMP.Manager.toString(), 25)
    val developer: Employee = Developer(Programming.kotlin.toString(), "ali", EMP.Developer.toString(), 365)

// Add  objects to the list of employees
    listOfEmployee.add(manager)
    listOfEmployee.add(developer)

    listOfEmployee.forEach() {
        it.work()
        it.report()
        println("---------")

    }

    // companion object methods
    Employee.printDetails(manager)
    Employee.printDetails(developer)

// extension function
    manager.details()
    developer.details()
    println("------------")

    //sealed Class
    val manager2: sealed = sealed.Manager("it", "ahmed", EMP.Manager.toString(), 65)
    val developer2: sealed = sealed.Developer(Programming.java.toString(), "amer", EMP.Developer.toString(), 45)

    manager2.detailsForSealed()
    println("------------")
    developer2.detailsForSealed()


}

private fun Employee.details() {
    when (this) {
        is Manager -> {
            this.work()
            this.report()
        }
        is Developer -> {
            this.work()
            this.report()
        }
    }

}

private fun sealed.detailsForSealed() = when (this) {
    is sealed.Manager -> {
        this.work()
        this.report()
    }

    is sealed.Developer -> {
        this.work()
        this.report()
    }


}
