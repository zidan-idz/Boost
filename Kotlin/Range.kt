
 fun fex(){
     val range = 1..20
     println(range.step)
 }

 fun def(){
     val range = 1..20 step 2
     range.forEach{
         print("$it")
     }
     println(range.step)
 }

 fun gud(){
     val index = 10.downTo(0)
     if( 5 in index){
         println("Melewati Angka ke 5")
     }
     val value = 0.rangeTo(10)
     if( 5 in value) {
         println("Melewati Angka ke 5")
     }
     val hoshi = 10.downTo(0)
     if( 5 !in hoshi) {
         println("Melewati Angka ke 5")
     }
 }

 fun ufj(){
     if(1 <= 10 && 10 <= 15){
         println("Angka 10 Tersedia")
     }
 }
