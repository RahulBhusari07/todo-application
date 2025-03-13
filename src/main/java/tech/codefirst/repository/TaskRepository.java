package tech.codefirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.codefirst.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
