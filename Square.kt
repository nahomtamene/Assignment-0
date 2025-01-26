class Square(_name: String) : Shape(_name) {
    private var side: Double = 0.0

    fun setDimensions(side: Double) {
        this.side = side
    }

    override fun printDimensions() {
        println("Square $name dimensions: side = $side")
    }

    override fun getArea(): Double {
        return side * side
    }
} 
