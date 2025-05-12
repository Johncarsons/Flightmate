package com.example.flightmate.viewmodel


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import com.example.flightmate.model.Flight

class FlightViewModel : ViewModel() {
    // Mutable state for the list of flights
    val flightList = mutableStateOf(
        listOf(
            Flight("EK721", "Nairobi", "Dubai", "On Time", "10:30 AM", "4:45 PM", "G5", "Terminal 1"),
            Flight("KQ102", "Johannesburg", "Nairobi", "Delayed", "2:00 PM", "6:15 PM", "A2", "Terminal 2")
        )
    )
}