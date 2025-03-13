package tech.codefirst.service;

import java.util.List;

import tech.codefirst.models.Task;



public interface MyService{

	List<Task> getallTask();

	void createTask(String title);

	void deleteTask(Long id);

	void toggleTask(Long id);

}
