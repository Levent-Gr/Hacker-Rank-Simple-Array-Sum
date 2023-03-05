fun main(args: Array<String>) {

    val ar = arrayOf(0,2,3,4)
    val result = simpleArraySum(ar)
    println(result)
}


fun simpleArraySum(ar: Array<Int>): Int {
    var sum=0
    ar.forEach {
        sum += it
    }
    return sum
}
