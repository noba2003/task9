sealed class sealed(open var name:String,
                    var id: Int ,
                    open var role:String="Employee") {
    open fun work() {
        println("$role is working")
    }
    open fun report() {
        println("$name is reporting")
    }
    class Manager(var department:String, override var name: String, override var role: String,id: Int) :sealed(name,id,role){
        override fun work() {
            println("$role is managing a particular $department.")
        }
        override fun report() {
            println("$name manager reports to the company board")
        }

    }
    class Developer(var programmingLanguage:String, override var name: String, override var role: String,id: Int) :sealed(name,id,role){
        override fun work() {
            println("$role  is coding in a particular $programmingLanguage.")
        }
        override fun report() {
            println("$name developer reports to their manager")
        }

    }

}