open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded : Boolean = false) : Phone() {

    override fun switchOn() {
        if(!isFolded){
            isScreenLightOn = true
        }
    }

    fun fold(){
        isFolded = true
    }

    fun unFold(){
        isFolded = false
    }
}