package com.cal.CalApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;
    private String fieldName;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String use;
    private int priority;
}

