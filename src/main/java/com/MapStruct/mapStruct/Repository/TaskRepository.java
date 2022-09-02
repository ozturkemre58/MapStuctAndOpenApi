package com.MapStruct.mapStruct.Repository;

import com.MapStruct.mapStruct.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
