package tech.codefirst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.codefirst.models.Task;
import tech.codefirst.repository.TaskRepository;

@Service
public class MyServiceimpl implements MyService {

    private final TaskRepository taskRepository;

    @Autowired
    public MyServiceimpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getallTask() {
        return taskRepository.findAll();
    }

	@Override
	public void createTask(String title) {
		Task task = new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskRepository.save(task);
		
	}

	@Override
	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
		
	}

	@Override
	public void toggleTask(Long id) {
	    Task task = taskRepository.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("INVALID TASK ID")); // Added semicolon

	    task.setCompleted(!task.isCompleted()); // Toggle completed status
	    taskRepository.save(task); // Save updated task
	}

}

