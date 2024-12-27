package com.example.kmm_fist_app

class CounterLogic {
    private var count = 0

    fun increment(): Int {
        count++
        return count
    }

    fun getCount(): Int = count
}