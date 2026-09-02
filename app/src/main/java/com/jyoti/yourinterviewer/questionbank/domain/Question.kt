package com.jyoti.yourinterviewer.questionbank.domain

data class Question(
    val questionText: String,
    val questionCategory: String,
    val questionDifficulty: String,
    val questionAnswer: String
)