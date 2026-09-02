package com.jyoti.yourinterviewer.questionbank.repository

import com.jyoti.yourinterviewer.questionbank.domain.Question

class QuestionRepositoryImpl : QuestionRepository {
    override fun getQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "What is an Activity in Android?",
                questionCategory = "Android Fundamentals",
                questionDifficulty = "Easy",
                questionAnswer = "An Activity represents a single screen or entry point in an Android application. It has a lifecycle managed by the Android system, including callbacks such as onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()."
            ),

            Question(
                questionText = "What is the Android Activity lifecycle?",
                questionCategory = "Android Fundamentals",
                questionDifficulty = "Easy",
                questionAnswer = "The Activity lifecycle describes the different states an Activity goes through during its lifetime. The main callbacks are onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy(). Developers use these callbacks to initialize resources, respond to visibility changes, and release resources."
            ),

            Question(
                questionText = "What is the difference between an Activity and a Fragment?",
                questionCategory = "Android Fundamentals",
                questionDifficulty = "Easy",
                questionAnswer = "An Activity represents a screen or entry point in an Android application, while a Fragment represents a reusable portion of UI hosted by an Activity or another Fragment. Fragments have their own lifecycle, which is influenced by their host."
            ),

            Question(
                questionText = "What is an Intent in Android?",
                questionCategory = "Android Fundamentals",
                questionDifficulty = "Easy",
                questionAnswer = "An Intent is a messaging object used to request an action from another Android component. It can be used to start Activities, start Services, or deliver broadcasts. Explicit intents identify a specific component, while implicit intents describe an action to be performed."
            ),

            Question(
                questionText = "What is the Android Application class used for?",
                questionCategory = "Android Fundamentals",
                questionDifficulty = "Medium",
                questionAnswer = "The Application class represents the application process and is created before other application components. It can be used for application-level initialization, although modern Android applications should avoid putting excessive logic or global state inside it."
            ),

            Question(
                questionText = "What is ViewModel in Android and why is it used?",
                questionCategory = "Architecture",
                questionDifficulty = "Medium",
                questionAnswer = "ViewModel is a lifecycle-aware component used to store and manage UI-related data. It survives configuration changes such as screen rotation and helps keep business and presentation logic out of Activities and Composables."
            ),

            Question(
                questionText = "What is the difference between StateFlow and LiveData?",
                questionCategory = "Architecture",
                questionDifficulty = "Medium",
                questionAnswer = "Both can expose observable state to the UI. StateFlow is part of Kotlin Coroutines and Flow, requires an initial value, and integrates naturally with coroutine-based code. LiveData is an Android lifecycle-aware observable type. For modern Kotlin applications, StateFlow is commonly preferred."
            ),

            Question(
                questionText = "What is Jetpack Compose?",
                questionCategory = "Jetpack Compose",
                questionDifficulty = "Easy",
                questionAnswer = "Jetpack Compose is Android's modern declarative UI toolkit. Instead of defining UI primarily through XML layouts, developers describe the UI using Kotlin composable functions. The UI is automatically recomposed when relevant state changes."
            ),

            Question(
                questionText = "What is recomposition in Jetpack Compose?",
                questionCategory = "Jetpack Compose",
                questionDifficulty = "Medium",
                questionAnswer = "Recomposition is the process where Compose re-executes composable functions whose inputs or observed state have changed. Compose uses this mechanism to update only the parts of the UI that need to change."
            ),

            Question(
                questionText = "What is remember in Jetpack Compose?",
                questionCategory = "Jetpack Compose",
                questionDifficulty = "Medium",
                questionAnswer = "remember stores a value across recompositions so that it is not recreated every time the composable function executes. The stored value is associated with the composition and is lost when the composable leaves the composition."
            ),

            Question(
                questionText = "What is the difference between remember and rememberSaveable?",
                questionCategory = "Jetpack Compose",
                questionDifficulty = "Hard",
                questionAnswer = "remember retains state across recompositions but does not automatically survive activity recreation. rememberSaveable can save supported state so that it can be restored after events such as configuration changes or process recreation when saved instance state is available."
            ),

            Question(
                questionText = "What are Kotlin Coroutines and why are they used in Android?",
                questionCategory = "Coroutines",
                questionDifficulty = "Easy",
                questionAnswer = "Kotlin Coroutines provide a structured way to perform asynchronous and long-running work without blocking the main thread. They make asynchronous code easier to read and maintain compared with callback-based approaches."
            ),

            Question(
                questionText = "What is structured concurrency in Kotlin Coroutines?",
                questionCategory = "Coroutines",
                questionDifficulty = "Hard",
                questionAnswer = "Structured concurrency ensures that coroutines have a well-defined lifecycle and are organized within a coroutine scope. Child coroutines are associated with their parent, which helps with cancellation, error propagation, and preventing work from continuing after its owner is no longer active."
            ),

            Question(
                questionText = "What is the Repository pattern in Android architecture?",
                questionCategory = "Architecture",
                questionDifficulty = "Medium",
                questionAnswer = "A Repository provides a single abstraction for accessing application data. It can coordinate between different data sources such as a remote API and a local database while hiding those implementation details from the ViewModel or domain layer."
            ),

            Question(
                questionText = "What is dependency injection and why is it useful in Android?",
                questionCategory = "Architecture",
                questionDifficulty = "Hard",
                questionAnswer = "Dependency injection is a technique where an object's dependencies are provided to it rather than the object creating them itself. It reduces coupling, makes components easier to replace, and improves testability. Android applications commonly use frameworks such as Hilt to manage dependencies."
            )
        )
    }
}