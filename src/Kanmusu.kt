/**
 * kanmusu base class
 * Created by tan5 on 2016/12/01.
 */
open class Kanmusu {
    var name: String? = "艦娘"
    var level: Int = 1
    var type: String? = "艦種"

    open fun info(): String {
        return "名前$name(Level:$level) 艦種$type"
    }
}