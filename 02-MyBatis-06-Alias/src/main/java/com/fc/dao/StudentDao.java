package com.fc.dao;

import com.fc.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> fandAll();
    List<Student> fandId(Integer id);
    List<Student> fandName(String name);
    List<Student> fandAge(Byte age);
    List<Student> fandByGender(String id);

}

