package com.MapStruct.mapStruct.Mapper;

import com.MapStruct.mapStruct.DTO.TaskDTO;
import com.MapStruct.mapStruct.Entity.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO modelToDto(Task task);

    Task DtoToModel(TaskDTO taskDTO);

    List<TaskDTO> ListModel(List<Task> tasks);


}
