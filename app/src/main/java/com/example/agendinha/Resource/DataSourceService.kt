package com.example.agendinha.Resource

import com.example.agendinha.model.Schedule

class DataSourceService {
    fun getSchedule(callback: (schedules : List<Schedule>) -> Unit)  {
        Thread(Runnable {
            Thread.sleep(1000)
            callback.invoke(
                listOf(
                    Schedule(
                        "",
                        "",
                        "",
                        ""
                    ),
                )
            )
        }).start()
    }
}