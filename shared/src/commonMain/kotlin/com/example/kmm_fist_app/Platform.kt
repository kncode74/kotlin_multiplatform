package com.example.kmm_fist_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform