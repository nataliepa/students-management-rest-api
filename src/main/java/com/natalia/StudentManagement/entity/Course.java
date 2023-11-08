package com.natalia.StudentManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column
    private String material;

    @ManyToOne
    @JoinColumn(name="professor_id", nullable=false)
    private Professor professor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<CourseRegistration> registrations;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Lecture> lectures;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Book> books;
}
