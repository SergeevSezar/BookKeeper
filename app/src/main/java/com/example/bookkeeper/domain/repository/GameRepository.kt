package com.example.bookkeeper.domain.repository

import com.example.bookkeeper.domain.entity.GameSettings
import com.example.bookkeeper.domain.entity.Level
import com.example.bookkeeper.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}