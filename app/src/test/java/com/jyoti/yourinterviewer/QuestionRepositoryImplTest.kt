package com.jyoti.yourinterviewer

import com.google.common.truth.Truth.assertThat
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepositoryImpl
import com.jyoti.yourinterviewer.questionbank.viewmodel.QuestionViewModel
import com.jyoti.yourinterviewer.tests.QuestionViewModelValidation
import org.junit.Test


class QuestionViewModelValidationTest {


    @Test
    fun `check repository returns non-empty list of questions`() {
        val questionRepositoryImpl = QuestionRepositoryImpl()
        val isValid = QuestionViewModelValidation.checkRepository(questionRepositoryImpl)
        assertThat(isValid).isTrue()
    }

}