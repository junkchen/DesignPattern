package jkotlin.command

class SellStock(val abcStock: Stock): Order {
    override fun execute() {
        abcStock.sell()
    }
}