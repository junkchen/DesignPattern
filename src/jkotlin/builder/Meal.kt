package jkotlin.builder

class Meal {
    private val items = ArrayList<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost(): Double {
        var cost = 0.0
        for (item in items){
            cost += item.price()
        }
        return cost
    }

    fun showItems() {
        for (item in items) {
            println("Item: ${item.name()}, Packing: ${item.packing().pack()}, Price: ${item.price()}")
        }
    }
}