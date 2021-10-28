package com.example.my_cool_library

import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.random.Random.Default.nextLong

data class LatLng(val latitude: Long, val longitude: Long)

object CoolLocation {

    private var timer: Timer? = null

    fun getLocationUpdates(every: Long = 5_000, callBack: (location: LatLng) -> Unit) {
        timer = fixedRateTimer("timer", false, 0, every) {
            callBack.invoke(LatLng(latitude = nextLong(), longitude = nextLong()))
        }
    }

    fun stopPeriodicUpdates() {
        timer?.cancel()
    }

    fun getCurrentLocation(): LatLng {
        return LatLng(latitude = 123, longitude = 456)
    }
}