package com.azure.sql.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "appointment_table")
public class Appointment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name = "appointment_date")
    private String appointmentDate;

    @Column( name = "appointment_text")
    private String appointmentText;


    public Appointment(){}


    public Appointment(int id, String appointmentDate, String appointmentText) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.appointmentText = appointmentText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentText() {
        return appointmentText;
    }

    public void setAppointmentText(String appointmentText) {
        this.appointmentText = appointmentText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id && Objects.equals(appointmentDate, that.appointmentDate) && Objects.equals(appointmentText, that.appointmentText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appointmentDate, appointmentText);
    }


    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", appointmentText='" + appointmentText + '\'' +
                '}';
    }
}
