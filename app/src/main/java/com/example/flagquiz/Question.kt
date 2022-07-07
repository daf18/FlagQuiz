package com.example.flagquiz

data class Question(
    val id: Int,
    val queststion: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    //will hold the calue of 1,2,3 or 4 as per above options
    val correctAnswer: Int
)
