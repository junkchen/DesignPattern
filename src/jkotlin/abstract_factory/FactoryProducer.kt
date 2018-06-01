package jkotlin.abstract_factory

class FactoryProducer {
    companion object {
        fun getFactory(type: Type): AbstractFactory =
                when (type) {
                    Type.SAHPE -> ShapeFactory()
                    Type.COLOR -> ColorFactory()
                }
    }
}
