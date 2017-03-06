package com.dkomo2.scholarshipconnect.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by david on 2/23/17.
 */

@Entity
data class School(
        val name: String,
        val latitude: Double,
        val longitude: Double,
        val url : String,
        @Id
        val schoolId: String = UUID.randomUUID().toString()
)

fun distance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
    val theta = lon1 - lon2
    var dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta))
    dist = Math.acos(dist)
    dist = rad2deg(dist)
    dist = dist * 60.0 * 1.1515
    return dist
}

fun deg2rad(deg: Double): Double {
    return deg * Math.PI / 180.0
}

fun rad2deg(rad: Double): Double {
    return rad * 180 / Math.PI
}