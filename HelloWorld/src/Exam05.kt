fun main(){
    var num1 : Int = 100
    var num2 : Int =0
    try{
        println(num1/num2)
    }catch (e: ArithmeticException){
        println("계산에 문제가 있습니다.")
    }
}