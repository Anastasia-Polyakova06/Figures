fun main() {
    val rect = Rect(4, 3, 4, 2)
    val circle = Circle(5, 5, 2)
    val square = Square(2, 2, 3)

    val figures: Array<Figure> = arrayOf(rect, circle, square)

    println("Площади до преобразований:")
    for (figure in figures) {
        println(figure.area())
    }

    val movableFigures: Array<Movable> = arrayOf(rect, circle, square)

    for (figure in movableFigures) {
        figure.move(1, 1)
    }

    val transformingFigures: Array<Transforming> = arrayOf(rect, circle, square)

    for (figure in transformingFigures) {
        figure.resize(2)
    }

    println("\nПосле перемещения и масштабирования:")
    println("Rect: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}, area=${rect.area()}")
    println("Circle: x=${circle.x}, y=${circle.y}, radius=${circle.radius}, area=${circle.area()}")
    println("Square: x=${square.x}, y=${square.y}, side=${square.side}, area=${square.area()}")

    for (figure in transformingFigures) {
        figure.rotate(RotateDirection.Clockwise, 3, -3)
    }

    println("\nПосле поворота по часовой стрелке вокруг точки (3, -3):")
    println("Rect: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}")
    println("Circle: x=${circle.x}, y=${circle.y}, radius=${circle.radius}")
    println("Square: x=${square.x}, y=${square.y}, side=${square.side}")

    for (figure in transformingFigures) {
        figure.rotate(RotateDirection.CounterClockwise, 3, -3)
    }

    println("\nПосле поворота против часовой стрелки:")
    println("Rect: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}")
    println("Circle: x=${circle.x}, y=${circle.y}, radius=${circle.radius}")
    println("Square: x=${square.x}, y=${square.y}, side=${square.side}")
}