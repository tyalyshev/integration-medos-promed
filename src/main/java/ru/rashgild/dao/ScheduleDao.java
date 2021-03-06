package ru.rashgild.dao;

import com.sun.jersey.api.client.ClientResponse;

import ru.rashgild.model.medos.ScheduleEntry;

public interface ScheduleDao {

    ClientResponse getDate(String date);

    ClientResponse getTimeByDateId(int dateId);

    ClientResponse sendResultToMedos(ScheduleEntry model);
}
