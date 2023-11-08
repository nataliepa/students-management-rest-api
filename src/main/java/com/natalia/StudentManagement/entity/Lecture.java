package com.natalia.StudentManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="lecture", uniqueConstraints = {@UniqueConstraint(columnNames = {"lecture_id", "course_id"})})
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long lecture_id;

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    private String lecture_topic;
}
