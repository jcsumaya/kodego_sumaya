fun main() {
    var grade:Float = 70.0F
    var gradeInCard:Float = 0.0F


//    if (grade >= 94.0F){
//        gradeInCard = 1.0F
//    }else if (grade in (89.0F).rangeTo(93.9F)) {
//        gradeInCard = 1.5F
//    }else if (grade in (83.0F).rangeTo(88.9F)) {
//        gradeInCard = 2.0F
//    }else if (grade in (78.0F).rangeTo(82.9F)) {
//        gradeInCard = 2.5F
//    }else if (grade in (72.0F).rangeTo(77.9F)) {
//        gradeInCard = 3.0F
//    }else if (grade in (66.0F).rangeTo(71.9F)) {
//        gradeInCard = 3.5F
//    }else if (grade in (60.0F).rangeTo(65.9F)) {
//        gradeInCard = 4.0F
//    }else{
//        gradeInCard = 5.0F
//    }
//    print("You got $gradeInCard")

    when(grade){
        in (94.0F).rangeTo(Float.MAX_VALUE) -> {
            gradeInCard = 1.0F
        }
        in (89.0F).rangeTo(93.9F) -> {
            gradeInCard = 1.5F
        }
        in (83.0F).rangeTo(88.9F) -> {
            gradeInCard = 2.0F
        }
        in (78.0F).rangeTo(82.9F) -> {
            gradeInCard = 2.5F
        }
        in (72.0F).rangeTo(77.9F) -> {
            gradeInCard = 3.0F
        }
        in (66.0F).rangeTo(71.9F) -> {
            gradeInCard = 4.0F
        }
        else -> {
            gradeInCard = 5.0F
        }
}
}