package com.jyoti.yourinterviewer.questionbank.domain

data class Question(
    val id: Int = 0,
    val questionText: String,
    val questionCategory: String,
    val questionDifficulty: String,
    val questionAnswer: String
) {

}