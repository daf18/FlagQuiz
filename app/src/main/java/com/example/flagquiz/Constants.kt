package com.example.flagquiz

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionlist = ArrayList<Question>()

        val q1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina", "Australia","Armenia","Austria",
            1
        )
        questionlist.add(q1)

        val q2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.belgium,
            "Germany", "Belgium","Italy","Netherlands",
            2
        )
        questionlist.add(q2)

        val q3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Bulgaria", "Bolivia","Brazil","Argentina",
            3
        )
        questionlist.add(q3)

        val q4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.denmark,
            "Denmark", "Sweden","Norway","Finland",
            1
        )
        questionlist.add(q4)

        val q5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Austria", "Australia","United Kingdom","U.S.A",
            2
        )
        questionlist.add(q5)

        val q6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.fiji_svg,
            "Bora-Bora", "Tahiti","Madagascar","Fiji",
            4
        )
        questionlist.add(q6)

        val q7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.germany_svg,
            "Belgium", "Germany","Spain","Colombia",
            2
        )
        questionlist.add(q7)

        val q8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.india,
            "Sudan", "Iran","India","Hungary",
            3
        )
        questionlist.add(q8)

        val q9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.kuwait,
            "Jordan", "Kuwait","India","Ireland",
            2
        )
        questionlist.add(q9)

        return questionlist
    }
}