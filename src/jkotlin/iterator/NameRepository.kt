package jkotlin.iterator

class NameRepository : Container {
    val names = ArrayList<String>()

    override fun getIterator(): Iterator = NameIterator()

    inner class NameIterator : Iterator{
        var index:Int = 0

        override fun hasNext(): Boolean = index < names.size

        override fun next(): Any? {
            if (this.hasNext()) {
                return names[index++]
            }
            return null
        }
    }
}