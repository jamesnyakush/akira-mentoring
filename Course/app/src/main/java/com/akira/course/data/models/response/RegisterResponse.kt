package com.akira.course.data.models.response

import com.akira.course.data.models.Student

data class RegisterResponse(
    val message: String,
    val student: Student
)