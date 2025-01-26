class EquilateralTriangle(_name: String) : Triangle(_name) {
    fun setDimensions(side: Double) {
        super.setDimensions(side, side, side)
    }

    override fun printDimensions() {
        println("Equilateral Triangle $name dimensions: side = $side1")
    }
} 
