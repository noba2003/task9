open class Employee (open var name:String,
                     var id: Int ,
                     open var role:String="Employee"){


    open fun work() {
        println("$role is working")
    }
    open fun report() {
        println("$name is reporting")
    }
   companion object {
       open fun printDetails( employee: Employee):Employee {
           var emp : Employee? = null
           when(employee){

               is Developer -> {
                   emp = employee as Developer
                   emp.work()
                   emp.report()
               }
               is Manager -> {
                   emp = employee as Manager
                   emp.work()
                   emp.report()
               }
           }

           return employee
       }
   }
}