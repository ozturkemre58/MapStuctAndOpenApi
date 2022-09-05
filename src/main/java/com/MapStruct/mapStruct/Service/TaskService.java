package com.MapStruct.mapStruct.Service;

import com.MapStruct.mapStruct.DTO.TaskDTO;

import java.util.List;

public interface TaskService {
    List<TaskDTO> list();

    TaskDTO getById(Long id);

    TaskDTO createTask(TaskDTO taskDTO);

    TaskDTO updateTask(TaskDTO taskDTO);



    Boolean deleteTask(Long id);

}
