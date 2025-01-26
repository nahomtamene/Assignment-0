fun main() {
    val shape1: Shape = Square("Square")
    val shape2: Shape = Circle("Circle")
    val shape3: Shape = Triangle("Triangle")
    val shape4: Shape = EquilateralTriangle("EquilateralTriangle")

    // Get user input for dimensions
    println("Enter square side length:")
    (shape1 as Square).setDimensions(readLine()!!.toDouble())

    println("Enter circle radius:")
    (shape2 as Circle).setDimensions(readLine()!!.toDouble())

    println("Enter triangle three sides:")
    (shape3 as Triangle).setDimensions(readLine()!!.toDouble(), readLine()!!.toDouble(), readLine()!!.toDouble())

    println("Enter equilateral triangle side:")
    (shape4 as EquilateralTriangle).setDimensions(readLine()!!.toDouble())

    // Print all results
    println("\nResults:")
    println("\n${shape1.name}:")
    shape1.printDimensions()
    println("Area: ${shape1.getArea()}")

    println("\n${shape2.name}:")
    shape2.printDimensions()
    println("Area: ${shape2.getArea()}")

    println("\n${shape3.name}:")
    shape3.printDimensions()
    println("Area: ${shape3.getArea()}")

    println("\n${shape4.name}:")
    shape4.printDimensions()
    println("Area: ${shape4.getArea()}")
}
