package task7

object Shapes:

  enum Shape:
    case Rectangle(l: Double, h: Double)
    case Circle(r: Double)
    case Square(l: Double)

  object Shape:
    def perimeter(shape: Shape): Double =
      shape match
        case Rectangle(l, h) => l * 2 + h * 2
        case Circle(r) => r * 3.14
        case Square(l) => l * 4

    def scale(shape: Shape, alpha: Double): Shape =
      shape match
        case Rectangle(l, h) => Rectangle(l * alpha, h * alpha)
        case Circle(r) => Circle(r * alpha)
        case Square(l) => Square(l * alpha)
      
      