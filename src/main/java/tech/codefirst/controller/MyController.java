package tech.codefirst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.codefirst.models.Task;
import tech.codefirst.service.MyService;

@Controller
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = myService.getallTask();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
    
    @PostMapping
    public String createTasks(@RequestParam String title) {
        myService.createTask(title);
      
        return "redirect:/";
    }
    
    
    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id) {
        myService.deleteTask(id);
        System.out.println("deleted");
        return "redirect:/";
    }
    
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id) {
        myService.toggleTask(id);
        System.out.println("toggledone");
        return "redirect:/";
    }
}
