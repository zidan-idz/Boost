import kotlin.random.Random

/*  PERCABANGAN DENGAN WHEN */
fun X(){
    val index = 3
    when(index){
        3 -> println("Index adalah 3")
        4 -> println("Index adalah 4")
        5 -> println("Index adalah 5")

    }
}

/*  PERCABANGAN DENGAN WHEN + ELSE */
fun Y(){
    val index = 7
    when(index){
        3 -> println("Index adalah 3")
        4 -> println("Index adalah 4")
        5 -> println("Index adalah 5")
        else -> println("Index tidak teridentifikasi")
    }
}

fun Z(){
    val index = 6
    val ofIndex = when(index){
        3 -> println("Index adalah 3")
        4 -> println("Index adalah 4")
        5 -> println("Index adalah 5")
        else -> println("Index tidak teridentifikasi")
    }
    println(ofIndex)
}

fun I(){
    val index = 6
    val ofIndex = when(index){
        3 -> {
            println("Index adalah ")
            "3"
        }
        4 -> {
            println("Index adalah ")
            "4"
        }
        5 -> {
            println("Index adalah ")
            "5"
        }
        else -> {
            println("Index tidak ")
            "teridentifikasi"
        }
    }
    println(ofIndex)
}


fun F(){
    val anyType: Any = 100L
    when(anyType){
        is Long -> println("Tipe-Data Long")
        is Int -> println("Tipe-Data Int")
        is Double -> println("Tipe-Data Double")
        else -> println("Tidak dapat diidentifikasi")
    }
}

fun K(){
    val index: Any = 100L
    if(index is Long){
        println("$index adalah tipe data Long")
    } else{
        println("$index bukan tipe data Long")
    }
}

fun T(){
    val index = 15
    val ranges = 10..20
    when(index){
        in ranges -> println("Index ada dalam ranges")
        !in ranges -> println("Index tidak ada dalam ranges")
    }
}

fun U(){
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)