package com.azure.sql.controller;


import com.azure.sql.entity.Appointment;
import com.azure.sql.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

   @Autowired
  public  AppointmentController (AppointmentService appointmentService){
      this.appointmentService = appointmentService;
  }

  @PostMapping
  public Appointment createAppointment(@RequestBody Appointment appointment){
       return appointmentService.createAppointment(appointment);
  }

  @GetMapping
  public List<Appointment> getAllAppointments(){

       return appointmentService.getAllAppointments();
  }

}
