package com.jyoti.yourinterviewer.questionbank.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jyoti.yourinterviewer.questionbank.repository.QuestionRepositoryImpl
import com.jyoti.yourinterviewer.questionbank.viewmodel.QuestionViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
@Composable
fun QuestionScreen(
    questionViewModel: QuestionViewModel = QuestionViewModel(QuestionRepositoryImpl())
){
    val questions by questionViewModel.questions.collectAsStateWithLifecycle(initialValue = emptyList())
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(16.dp)) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(questions, key = { it.id }) { item ->
                Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                        text = item.id.toString() + ". " + item.questionText,
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        color = Color.Black
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Category: " + item.questionCategory,
                            color = Color.Blue,
                            fontSize = 12.sp
                        )
                        Text(
                            text = "Difficulty: " + item.questionDifficulty,
                            fontSize = 12.sp,
                            color = when(item.questionDifficulty){
                                "Easy" -> Color.Green
                                "Medium" -> Color.Yellow
                                else -> Color.Red
                            }
                           )
                    }
                }
            }
        }

    }
}
@Composable
@Preview
fun QuestionScreenPreview() {
    QuestionScreen()
}