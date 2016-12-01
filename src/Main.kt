/**
 * Main
 * Created by tan5 on 2016/12/01.
 */

fun main(args : Array<String>){
    System.out.println("Hello world!")
    stepOne()
}

fun stepOne(){


    val kongou = Kanmusu()
    kongou.level = 120
    kongou.name = "金剛"
    kongou.type = "戦艦"
    System.out.println(kongou.info())

    val senkanSeiki = AbyssKan()
    System.out.println(senkanSeiki.info())

    //名前のない作戦名 矛盾
    val sakusenName : String? = null
    val result = sakusenName?.equals("東")

    val sakusenName2 : String = "アイアンボトムサウンド"
    val result2 = sakusenName2 == "アイアンボトムサウンド"

    if(result == null){
        log("NULL ")
    }

    log("result : " + result2)
}

fun log(msg : String){
    System.out.println(msg)
}