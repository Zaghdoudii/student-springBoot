package com.zaghdoudi.student.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "zaghdoudi",
                        "mohamed",
                        LocalDate.now(),
                        "test@gmail.com",
                        22
                ),
                new Student(
                        "student1",
                        "student11",
                        LocalDate.now(),
                        "test@gmail.com",
                        20
                )
        );
    }
}
