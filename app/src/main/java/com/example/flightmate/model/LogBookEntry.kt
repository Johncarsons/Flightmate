package com.example.flightmate.model

data class LogbookEntry(
    val id: String = "",
    val aircraftType: String = "",
    val registration: String = "",
    val departureAirport: String = "",
    val arrivalAirport: String = "",
    val flightTime: Double = 0.0,
    val date: String = "",
    val flightType: String = "",  // VFR, IFR, Night, etc.
    val role: String = "",        // PIC, Co-Pilot, Observer
    val remarks: String = ""
)