package com.relationship.demo.model;

import lombok.*;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@Data
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    private Integer id;

    @Column(name = "COURSE_NAME")
    private String name;

}
