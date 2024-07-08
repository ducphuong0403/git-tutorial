package fa.training.demoSpringBoot.mapper;

import java.util.List;

import fa.training.demoSpringBoot.model.Dept;

public interface DeptMapper {
	public List<Dept> selectAllStudent();
    public Dept selectDeptById(int projectId);
}
