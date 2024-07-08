package fa.training.demoSpringBoot.service;

import java.util.List;

import fa.training.demoSpringBoot.model.Project;
public interface ProjectService {
	public List<Project> selectAllProject();
    public Project selectProjectById(int projectId);
}
