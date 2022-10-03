package com.azure.sql.dao;


import com.azure.sql.entity.Appointment;
import com.azure.sql.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentDaoImpl implements AppointmentDao{

    private final AppointmentRepository appointmentRepository;

   @Autowired
    public AppointmentDaoImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
