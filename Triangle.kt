open class Triangle(_name: String) : Shape(_name) {
    protected var side1: Double = 0.0
    protected var side2: Double = 0.0
    protected var side3: Double = 0.0

    open fun setDimensions(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        println("Triangle $name dimensions: side1 = $side1, side2 = $side2, side3 = $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
} 
