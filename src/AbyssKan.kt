/**
 * shinkai-seikan
 * Created by tan5 on 2016/12/01.
 */

class AbyssKan : Kanmusu() {

    var himeType : Type = Type.HIME

    enum class Type {
        HIME, SUIKI, KICHI
    }

    override fun info() : String {
        return super.info() + " 深海"
    }
}
