class Automobile : Car {
    var seatNum : Int =0

    constructor(){
    }
    fun counSeatNum():Int{
        return seatNum
    }
    override fun upSpeed(value:Int) {
        if (speed + value >= 300)
            speed = 300
        else
            speed = speed + value
    }
}