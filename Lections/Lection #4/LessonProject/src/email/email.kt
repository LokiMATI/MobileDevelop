package email

class Message(msg : String) {
    var text : String = msg
        set(value){
            if (value.isNotEmpty())
                field = value
        }
        get() {
            return field
        }

    val letter : Char
        get() = text.first()
}