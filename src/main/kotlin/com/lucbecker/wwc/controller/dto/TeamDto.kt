package com.lucbecker.wwc.controller.dto

import com.lucbecker.wwc.domain.model.Team

data class TeamDto(
    val abbreviation: String,
    val name: String,
    val fifaRanking: Double
) {
    companion object {
        fun fromModel(model: Team): TeamDto {
            return TeamDto(model.abbreviation, model.name, model.fifaRanking)
        }
    }

    fun toModel(): Team {
        return Team(this.abbreviation, this.name, this.fifaRanking)
    }
}