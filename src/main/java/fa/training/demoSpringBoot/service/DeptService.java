package fa.training.demoSpringBoot.service;

import java.util.List;

import fa.training.demoSpringBoot.model.Dept;
public interface DeptService {
	public List<Dept> selectAllStudent();
    public Dept selectDeptById(int projectId);
}
