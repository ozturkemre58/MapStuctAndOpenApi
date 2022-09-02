package com.MapStruct.mapStruct.Entity;

import lombok.Data;


import javax.persistence.*;

import java.util.ArrayList;

@Entity
@Data
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String listName;
    private ArrayList<String> toDoList = new ArrayList<>();





}
