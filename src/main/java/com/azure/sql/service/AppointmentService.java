package com.azure.sql.service;

import com.azure.sql.entity.Appointment;

import java.util.List;

public interface AppointmentService {

    public Appointment createAppointment(Appointment appointment);

    public List<Appointment> getAllAppointments();
}
