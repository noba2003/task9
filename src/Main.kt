//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var manager:Employee = Manager("HR","ahmed",EMP.Manager.toString(),25)
    var developer:Employee = Developer(programming.kotlin.toString(),"ali",EMP.Developer.toString(),365)
Employee.printDetails(manager)
Employee.printDetails(developer)
    println("------------")

    println(manager.work())
    println(manager.report())
    println("------------")
    println(developer.work())
    println(developer.work())
}