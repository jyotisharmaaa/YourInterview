package com.jyoti.yourinterviewer

import com.google.common.truth.Truth.assertThat
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepositoryImpl
import org.junit.Test


class QuestionRepositoryImplTest {


    @Test
    fun `getQuestions returns all 15 seeded questions`() {
        val questionRepositoryImpl = QuestionRepositoryImpl()
        assertThat(questionRepositoryImpl.getQuestions()).hasSize(15)
    }

}