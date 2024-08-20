class Developer(var programmingLanguage:String, override var name: String, override var role: String,id: Int) :Employee(name,id,role){
    override fun work() {
        println("$role  is coding in a particular $programmingLanguage.")
    }
    override fun report() {
        println("$name developer reports to their manager")
    }

}
