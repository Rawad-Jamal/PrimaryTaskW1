fun checkListChars(abList:List<String>):Int{
    var aCount=0
    var returnValue=0
    var aPercentage=0.0
    loop1@ for(element in abList){
        if(element=="a" || element=="b" ){
            if(element=="a") aCount++ else {}
            //returnValue=aCount
        }
        else { returnValue=-1 ; break@loop1 }
    }
    if(returnValue!=-1){
        aPercentage=(aCount*100)/abList.size.toDouble()
        println("The Percentage of char 'a' Repetitions in abCharList: "+"%.1f".format(aPercentage))
    }

    return returnValue
}

fun main() {
    val abCharList=listOf("a","b","b")

    //var aPercentage=(checkListChars(abCharList)*100)/abCharList.size.toDouble()
   // println("The Percentage of char 'a' Repetitions in abCharList: "+"%.1f".format(aPercentage))
}