package jkotlin.composite

data class Employee(private val name: String,
                    private val dept: String,
                    private val salary: Int) {

    val subordinates: ArrayList<Employee> = ArrayList()

    fun add(e: Employee) {
        subordinates.add(e)
    }

    fun remove(e: Employee) {
        subordinates.remove(e)
    }

    override fun toString(): String = "Employee: [name: $name, dept: $dept, salary: $salary]"
}