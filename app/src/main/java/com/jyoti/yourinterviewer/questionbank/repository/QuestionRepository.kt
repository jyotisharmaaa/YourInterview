package com.jyoti.yourinterviewer.questionbank.repository

import com.jyoti.yourinterviewer.questionbank.domain.Question

interface QuestionRepository {
    fun getQuestions(): List<Question>
}