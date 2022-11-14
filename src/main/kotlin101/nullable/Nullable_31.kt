package nullable

data class Form(val firstname:String,
           val lastname:String,
           val school:String?){

    fun execute(){
        school?.let {

        }
    }
}

fun main(){
    var myForm = Form("Marco", "Valmores", null)
}

//inheritance