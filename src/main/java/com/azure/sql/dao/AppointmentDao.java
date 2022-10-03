package com.azure.sql.dao;

import com.azure.sql.entity.Appointment;

import java.util.List;

public interface AppointmentDao {

     public Appointment createAppointment(Appointment appointment);

     public List<Appointment> getAllAppointments();
}
