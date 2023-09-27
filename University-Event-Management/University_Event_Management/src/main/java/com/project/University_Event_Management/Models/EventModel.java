package com.project.University_Event_Management.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class EventModel {
    @Id
    @NotNull
    private Integer eventId;
    @NotBlank
    private String eventName;
    @NotBlank
    private String locationOfEvent;
    @NotNull
    private LocalDate date;


    private LocalTime startTime;
    
    private LocalTime endTime;

}
