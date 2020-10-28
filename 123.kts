fun main(){
    val cord= Point(x = 7F, y = 10F)

    println(cord.getArea())
}

interface IFigure {
    fun getArea(): Float
}

class Point (x: Float = 7F, y: Float = 10F): IFigure {
    private var xCoordinate: Float = x
    private var yCoordinate: Float = y

    override fun toString(): String {
        return "$xCoordinate, $yCoordinate"
    }

    override fun getArea(): Float {
        return xCoordinate * yCoordinate / 2
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (xCoordinate > yCoordinate) {
            }
        }
        return false
    }
}
