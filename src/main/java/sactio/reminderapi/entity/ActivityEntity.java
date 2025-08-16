package sactio.reminderapi.entity;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "activity")
public class ActivityEntity {

    @Id
    @Column(name = "activity_id", nullable = false)
    private Integer activityId;

    @Column(name = "activity_name", nullable = false)
    private String activityName;
}

