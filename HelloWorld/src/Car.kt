class Car{
    var color :String =""
    var speed :Int =0

    fun upSpeed(value:Int){
        if(spped+value>=200)
            speed =200
        else
            speed = speed+value
    }
    fun downSpeed(value: Int){
        if(speed-value<=0)
            speed = 0
        else
            speed = speed - value
    }


}

