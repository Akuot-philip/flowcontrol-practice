fun main() {
    var name = "Tom"
    if (name == "tom") {
        println("Hello Tom")
    } else {
        println("who are you?")
    }
    var calc = define(13)
    print(calc)

    hasVisitedCapital("Kenyan")

    saySomething("Timothy")
    saySomething("Thomas")
    saySomething("phel")


    println(putPassword("12345678"))
    println(putPassword("password"))
    println(putPassword("12345678yyy,ugs,xyjxfvz"))
    println(putPassword("1234"))

    hasVisitedCapital("kenyan")
    hasVisitedCapital("nigerian")
    hasVisitedCapital("ethiopia")
    hasVisitedCapital("Rwandies")

    var languages = arrayOf("kiswahili", "English", "Kinyarwanda", "luganda")
    for (lang in languages) {
        println(lang)
    }

//    for (n in 23..64){
//        println(n)
//    }
getBingo()
}

fun define(num:Int) {
    if (num % 2 == 0){
        println("The number is even")
    } else{
        println("The number is odd")
    }

}
fun hasVisitedCapital(nationality:String) {

    when(nationality){
        "kenyan","ugandan","Tanzanian"-> println("Have you ever been to Nairobi?")
        "Ethiopia","Eritrea",-> println("Have you ever been to addis?")
        "nigerian","Ganian"-> println("Have you ever been to lagos?")
        else -> println("Have you ever been to Africa")
    }

//    when(nationality){
//        "kenyan"-> println("Have you ever been to Nairobi?")
//        "Tanzanian"-> println("Have you ever been to Kampal?")
//        "Ugandan"-> println("Have you ever been to Dodoma?")
//        else -> println("Have you ever been to E.A")
//    }
}
//    if (nationality.equals("Kenyan")) {
//        println("Have you ever been to Nairobi")
//
//    } else if (nationality.equals("Tanzannia")) {
//        println("Have you ever been to Dodoma")
//
//    } else if (nationality.equals("Uganda")) {
//        println("Have you ever been to Kampala")
//    }
//    else {
//        println("Have you ever been to East Africa")
//    }
//}
fun saySomething(friend:String) {
    if (friend.equals("Timothy")) {
        println("Collect your books tomorrow")
    }
    else if (friend.equals("Thomas")) {
        println("i went to the zoo last weekend")
    } else {
        println("Hello $friend")

    }
}
fun putPassword(password:String):Boolean {

    if (password.length >=8 && password.length <=16 && !password.equals("password")) {
        return true

    }
    return false


}
fun printOddSquare(){
    for (n in 1..10){
        if(n%2 !=0){
            println(n*n)
        }
    }
}
fun getBingo(){
    for (b in 1..1000) {
        if (b % 6 == 0 && b % 8 == 0) {
            println("Bingo")
        }
        else if (b % 6 == 0 || b % 8 == 0) {
            println(b)
        }

    }
}
