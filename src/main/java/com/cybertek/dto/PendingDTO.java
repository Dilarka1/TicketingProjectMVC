package com.cybertek.dto;

import com.cybertek.utils.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Setter
@Getter
public class PendingDTO {

    private Long id;
    private ProjectDTO project;
    private UserDTO assignedEmployee;
    private String taskSubject;
    private String taskDetail;
    private Status taskStatus;
    private LocalDate assignedDate;

    public PendingDTO(ProjectDTO project, UserDTO assignedEmployee, String taskSubject, String taskDetail, Status taskStatus, LocalDate assignedDate) {

        this.project = project;
        this.assignedEmployee = assignedEmployee;
        this.taskSubject = taskSubject;
        this.taskDetail = taskDetail;
        this.taskStatus = taskStatus;
        this.assignedDate = assignedDate;
        this.id = UUID.randomUUID().getMostSignificantBits();

    }
}
