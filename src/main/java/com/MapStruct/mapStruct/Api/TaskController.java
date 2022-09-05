package com.MapStruct.mapStruct.Api;


import com.MapStruct.mapStruct.DTO.TaskDTO;
import com.MapStruct.mapStruct.Service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;


    @PostMapping("/create")
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO) {

        taskService.createTask(taskDTO);
        return ResponseEntity.ok(taskDTO);
    }


    @GetMapping("/getAll")
    public List<TaskDTO> getTasks() {

        return taskService.list();
    }

    @GetMapping("/getBy/{id}")
    public ResponseEntity<TaskDTO> getById(@PathVariable Long id) {
        TaskDTO taskDTO = taskService.getById(id);
        return ResponseEntity.ok(taskDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<TaskDTO> updateTask(@RequestBody TaskDTO taskDTO) {
        TaskDTO updateTask = taskService.updateTask(taskDTO);
        return ResponseEntity.ok(updateTask);


    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
        Boolean status = taskService.deleteTask(id);
        return ResponseEntity.ok(status);
    }


}



