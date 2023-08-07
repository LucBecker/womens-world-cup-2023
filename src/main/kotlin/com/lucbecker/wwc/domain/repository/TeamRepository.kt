package com.lucbecker.wwc.domain.repository

import com.lucbecker.wwc.domain.model.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, String>