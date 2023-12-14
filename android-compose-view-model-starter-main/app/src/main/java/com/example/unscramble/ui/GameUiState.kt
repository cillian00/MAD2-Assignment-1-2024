package com.example.unscramble.ui

data class GameUiState(
    val isGuessedWordWrong: Boolean = false,
    val currentWordCount: Int = 1,
    val currentScrambledWord: String = "",
    val score: Int = 0,
    val isGameOver: Boolean = false

)