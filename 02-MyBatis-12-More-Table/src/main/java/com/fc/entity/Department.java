package com.fc.entity;

import java.util.List;

public class Department {
    private Integer id;
    private String name;
    //一对多关系，一个部门中有多个员工
    private List<Employee> employees;
}
