package jkotlin.builder

class MealBuilder {
    fun prepareVegBurger() = Meal().apply {
        addItem(VegBurger())
        addItem(Coke())
    }

    fun prepareNonVegBurger() = Meal().apply {
        addItem(ChickenBurger())
        addItem(Pepsi())
    }
}