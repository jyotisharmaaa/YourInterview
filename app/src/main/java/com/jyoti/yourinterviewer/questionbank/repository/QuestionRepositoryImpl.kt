package com.jyoti.yourinterviewer.questionbank.repository

import com.jyoti.yourinterviewer.questionbank.domain.Question

class QuestionRepositoryImp : QuestionRepository {
    override fun getQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "What is the capital of France?",
                questionCategory = "Geography",
                questionDifficulty = "Easy",
                questionAnswer = "Paris"
            ),
            Question(
                questionText = "What is the largest planet in our solar system?",
                questionCategory = "Science",
                questionDifficulty = "Medium",
                questionAnswer = "Jupiter"
            ),
            Question(
                questionText = "Who wrote the play 'Romeo and Juliet'?",
                questionCategory = "Literature",
                questionDifficulty = "Hard",
                questionAnswer = "William Shakespeare"
            )
        )
    }
}