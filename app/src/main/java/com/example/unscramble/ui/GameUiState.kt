package com.example.unscramble.ui

/**
 * Data class represents game UI state
 * - StateFlow can be exposed from the class state e.g. GameUiState,
 *  so that the composables can listen for UI state updates and make the screen state survive
 *  configuration changes.
 */
data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)
