package fa.training.demoSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fa.training.demoSpringBoot.model.Project;
import fa.training.demoSpringBoot.service.ProjectService;

@Controller
public class ListController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String showListProject(Model model) {
        List<Project> projects = projectService.selectAllProject();
        model.addAttribute("projects", projects);
        return "login"; // Trả về tên của template Thymeleaf (login.html)
    }
}
