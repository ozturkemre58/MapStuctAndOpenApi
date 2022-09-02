package com.MapStruct.mapStruct.DTO;

import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
public class TaskDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String listName;
    private ArrayList<String> toDoList = new ArrayList<>();
}
