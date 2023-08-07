package com.lucbecker.wwc.service

import com.lucbecker.wwc.domain.model.Team

interface SimulateService {
    fun simulate(team1Id: String, team2Id: String): Team

}