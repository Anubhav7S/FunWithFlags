package com.example.funwithflags

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val Que1=Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Latvia",
            "Venezuela",
            "Portugal",
            1
        )
        questionsList.add(Que1)
        val Que2=Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belarus","Belgium","Germany","Italy",
            2
        )
        questionsList.add(Que2)
        val Que3=Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Brazil","Senegal","Japan",
            2
        )
        questionsList.add(Que3)
        val Que4=Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Armenia","New Zealand","Sudan","Australia",
            4
        )
        questionsList.add(Que4)
        val Que5=Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Angola","Norway","Denmark","Montenegro",
            3
        )
        questionsList.add(Que5)
        val Que6=Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","United Kingdom","Northern Ireland","Canada",
            1
        )
        questionsList.add(Que6)
        val Que7=Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Spain","Germany","Ireland","Cyprus",
            2
        )
        questionsList.add(Que7)
        val Que8=Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Italy","Ireland","India","Russia",
            3
        )
        questionsList.add(Que8)
        val Que9=Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "India","Iraq","Kuwait","Jordan",
            3
        )
        questionsList.add(Que9)
        val Que10=Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia","Tanzania","Jamaica","New Zealand",
            4
        )
        questionsList.add(Que10)
        return questionsList
    }
}