package task7

import org.junit.*
import org.junit.Assert.*
import Shapes.*

class ShapeTest:
    @Test def squarePerimeterTest(): Unit = {
        val square = Shape.Square(5.0)
        assertEquals(Shape.perimeter(square), 20.0, 0)
    }

    @Test def rectanglePerimeterTest(): Unit = {
        val rect = Shape.Rectangle(5.0, 3.0)
        assertEquals(Shape.perimeter(rect), 16.0, 0)
    }

    @Test def circlePerimeterTest(): Unit = {
        val circ = Shape.Circle(1.0)
        assertEquals(Shape.perimeter(circ), 3.14, 0)
    }

    @Test def squareScaleTest(): Unit = {
        val square = Shape.Square(5.0)
        assertEquals(Shape.scale(square, 5), Shape.Square(25.0))
    }

    @Test def rectangleScaleTest(): Unit = {
        val rect = Shape.Rectangle(5.0, 3.0)
        assertEquals(Shape.scale(rect, 5), Shape.Rectangle(25.0, 15.0))
    }

    @Test def circleScaleTest(): Unit = {
        val circ = Shape.Circle(1.0)
        assertEquals(Shape.scale(circ, 5), Shape.Circle(5.0))
    }

    @Test def scaleAndPerimeterTest(): Unit = {
        val square = Shape.Square(5.0)
        val square2 = Shape.scale(square, 5)
        assertEquals(Shape.perimeter(square2), 100, 0)
    }