fun main() {
val age: Int = 50
    println(age)
var cityName: String? = "New York"
    cityName = null
    println(cityName)
    var cityLength = cityName?.length ?: 0
    println(cityLength)



//    calculateScore(70.00)
    println("Score 70, ${calculateScore(70.00)}")

}
fun calculateScore(score:Double?):String {
    val finalScore = score?: 0.0
    return  if(finalScore >= 50) "pass" else "fail"
}