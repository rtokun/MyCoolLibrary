package com.example.my_cool_library

data class LatLng(val latitude: Long, val longitude: Long)

class CoolLocation {
    companion object{
        fun getCurrentLocation(): LatLng{
            return LatLng(latitude = 123, longitude = 456)
        }
    }
}