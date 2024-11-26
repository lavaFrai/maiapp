package ru.lavafrai.maiapp.models.schedule

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Schedule(
    @SerialName("name") val name: String,
    @SerialName("created") val created: Long,
    @SerialName("cached") val cached: Long,
    @SerialName("days") val days: List<ScheduleDay>,
) {
    /*
    private var weeks: MutableList<ScheduleWeekId>? = null

    fun getWeeks(): List<ScheduleWeekId> {
        var i = 1

        if (weeks == null) {
            weeks = mutableListOf()
            days.forEach {
                val week = it.date!!.getWeek()
                if (weeks!!.find {week == it.range} == null) {weeks!!.add(ScheduleWeekId(i, it.date.getWeek()));i++}

            }
            weeks!!.sortBy { scheduleWeekId -> scheduleWeekId.range.startDate }
        }

        return weeks!!
    }

    fun getWeek(number: Int): List<ScheduleDay> {
        val weekId = getWeeks().find { it.number == number } ?: return listOf()
        return days.filter { weekId.range.contains(it.date!!) }.sortedBy { it.date }
    }

    fun getCurrentWeekSchedule(): List<ScheduleDay> {
        val week = Date.now().getWeek()
        return days.filter { week.contains(it.date!!) }.sortedBy { it.date }
    }

    fun getScheduleOfDay(day: Date): ScheduleDay {
        return days.find { it.date == day } ?: ScheduleDay(day, day.toLocalDate().dayOfWeek.castToSerializable(), listOf())
    }
    */
}

/*
fun getEmptySchedule(): Schedule {
return Schedule(Group(""), 0, listOf())
}
*/