class Manager(var department:String, override var name: String, override var role: String,id: Int) :Employee(name,id,role){
    override fun work() {
        println("$role is managing a particular $department.")
    }
    override fun report() {
        println("$name manager reports to the company board")
    }

}