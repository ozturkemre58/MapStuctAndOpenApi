package com.MapStruct.mapStruct.Service;

import com.MapStruct.mapStruct.DTO.TaskDTO;
import com.MapStruct.mapStruct.Entity.Task;
import com.MapStruct.mapStruct.Mapper.TaskMapper;
import com.MapStruct.mapStruct.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceIMPL implements TaskService{

    private  final TaskRepository taskRepository;
    private  final  TaskMapper taskMapper;


    @Override
    public List<TaskDTO> list() {

        return taskMapper.ListModel(taskRepository.findAll()) ;
    }

    @Override
    public TaskDTO getById(Long id) {
        return taskMapper.modelToDto(taskRepository.findById(id).get());
    }

    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {

        taskRepository.save(taskMapper.DtoToModel(taskDTO));
        return taskDTO;
    }

    @Override
    public TaskDTO updateTask(TaskDTO taskDTO) {

           Task task = taskRepository.save(taskMapper.DtoToModel(taskDTO));

        return taskDTO;

    }


    @Override
    public Boolean deleteTask(Long id) {
        Optional<Task> task =  taskRepository.findById(id);
        if (task.isPresent())
        {
            taskRepository.deleteById(id);
            return true;
        }

          return false ;
    }
}



