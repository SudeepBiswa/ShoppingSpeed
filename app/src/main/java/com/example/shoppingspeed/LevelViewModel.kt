package com.example.shoppingspeed

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.SnapshotMutableState
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.delay

class LevelViewModel(
    val navController: NavController,
): ViewModel() {
    var score: MutableState<Int> = mutableStateOf(0) //as SnapshotMutableState
    var timeRemaining: SnapshotMutableState<Long> = mutableStateOf(10L) as SnapshotMutableState
    var timerKey = "timerKey"

    suspend fun startTimer(didWin: () -> Boolean) {
        while (timeRemaining.value > 0) {
            delay(1000L)
            timeRemaining.value--
        }
        if (didWin()) {
            goToWin()
        } else {
            goToLose()
        }
    }

    // should update to using viewmodel based score
    fun incrementScore() {
        score.value++
    }

    fun goToLose() {
        navController.navigate(Screen.LoseScreen.route)
    }

    fun goToWin() {
        navController.popBackStack()
        navController.navigate(Screen.WinScreen.route)
    }
}