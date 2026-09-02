package com.jyoti.yourinterviewer.questionbank.viewmodel

import androidx.lifecycle.ViewModel
import com.jyoti.yourinterviewer.questionbank.domain.Question
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepository
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepositoryImpl

class QuestionViewModel(questionRepository: QuestionRepository) : ViewModel() { // passed to get better testability and to avoid tight coupling with the repository implementation
    private val questions: List<Question> = questionRepository.getQuestions() // fetched questions from the repository

    fun getQuestions(): List<Question> {
        return questions
    }
}
