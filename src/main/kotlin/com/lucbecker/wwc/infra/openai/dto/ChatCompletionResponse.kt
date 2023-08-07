package com.lucbecker.wwc.infra.openai.dto

data class ChatCompletionResponse(
    val model: String,
    val choices: List<Choice>
)