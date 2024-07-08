package fa.training.demoSpringBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.demoSpringBoot.mapper.ProjectMapper;
import fa.training.demoSpringBoot.model.Project;
import fa.training.demoSpringBoot.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectMapper projectMapper;
	
	@Override
	public List<Project> selectAllProject() {
		// TODO Auto-generated method stub
		return projectMapper.selectAllProject();
	}

	@Override
	public Project selectProjectById(int projectId) {
		// TODO Auto-generated method stub
		return projectMapper.selectProjectById(projectId);
	}

}
