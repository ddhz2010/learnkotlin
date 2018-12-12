package com.davidherndeztechpro.learn.kotlin.utils

import java.util.*

class TimeUtils {
    fun daysAgo(numDaysAgo: Int): Date {
        val calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -numDaysAgo)

        return calendar.time
    }
}