package jkotlin.command

class Broker {
    private val orderList = ArrayList<Order>()

    fun takeOrder(order: Order) {
        orderList.add(order)
    }

    fun placeOrders() {
        for (order in orderList) {
            order.execute()
        }
        orderList.clear()
    }
}