package com.example.flightmate.model

data class Flight(
    val flightNumber: String,
    val departure: String,
    val arrival: String,
    val status: String,
    val departureTime: String,
    val arrivalTime: String,
    val gate: String? = null,
    val terminal: String? = null
)