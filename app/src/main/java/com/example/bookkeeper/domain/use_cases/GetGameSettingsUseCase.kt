package com.example.bookkeeper.domain.use_cases

import com.example.bookkeeper.domain.entity.GameSettings
import com.example.bookkeeper.domain.entity.Level
import com.example.bookkeeper.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val gameRepository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return gameRepository.getGameSettings(level)
    }
}