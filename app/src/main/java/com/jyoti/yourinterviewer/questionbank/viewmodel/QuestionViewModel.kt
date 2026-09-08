package com.jyoti.yourinterviewer.questionbank.viewmodel

import androidx.lifecycle.ViewModel
import com.jyoti.yourinterviewer.questionbank.domain.Question
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepository
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class QuestionViewModel(questionRepository: QuestionRepository) : ViewModel() { // passed to get better testability and to avoid tight coupling with the repository implementation

    private val _questions = MutableStateFlow<List<Question>>(emptyList())
    val questions : StateFlow<List<Question>> = _questions
    init{
        fetchQuestions(questionRepository)
    }

    private fun fetchQuestions(q: QuestionRepository) {
        _questions.value = q.getQuestions()
    }
}
