package com.relationship.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="STUDENT_ID")
    private Integer studentId;

    @Column(name ="STUDENT_NAME")
    private String name;

    @OneToMany(targetEntity = Course.class,
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name="course_user_fk", referencedColumnName = "STUDENT_ID")
    private List<Course> courses;
}
