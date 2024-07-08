package fa.training.demoSpringBoot.mapper;

import java.util.List;

import fa.training.demoSpringBoot.model.Project;

public interface ProjectMapper {
	public List<Project> selectAllProject();
    public Project selectProjectById(int projectId);
}
