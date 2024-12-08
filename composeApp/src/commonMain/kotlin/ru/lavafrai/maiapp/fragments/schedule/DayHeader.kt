package ru.lavafrai.maiapp.fragments.schedule

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.lavafrai.maiapp.models.schedule.ScheduleDay

@Composable
fun DayHeader(
    day: ScheduleDay,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
    ) {
        Text("Day: ${day.date}, ${day.dayOfWeek}")
    }
}